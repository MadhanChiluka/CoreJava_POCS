package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import javax.crypto.EncryptedPrivateKeyInfo;

public class CustomizedSerialization {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
Account account= new Account();
System.out.println(account.username+"_______"+account.password);

FileOutputStream fos= new FileOutputStream("CustomizedSerilazation.txt");
ObjectOutputStream oos = new ObjectOutputStream(fos);
oos.writeObject(account);

FileInputStream fis = new  FileInputStream("CustomizedSerilazation.txt");
ObjectInputStream ois= new ObjectInputStream(fis);
Account account2 = (Account) ois.readObject();
System.out.println(account2.username+"_________"+account2.password);

}

}

class Account implements Serializable {
	String username="Madhan";
	transient String password = "ichiluka";
	
	private void writeObject(ObjectOutputStream obj) throws Exception {
		obj.defaultWriteObject();
		String encryptedPassword=password+"12345";
		obj.writeObject(encryptedPassword);

	}
	private void readObject(ObjectInputStream is) throws Exception {
		is.defaultReadObject();
		String encrptedPassword = (String) is.readObject();
		password=encrptedPassword.substring(0, 8);
	}
	
}