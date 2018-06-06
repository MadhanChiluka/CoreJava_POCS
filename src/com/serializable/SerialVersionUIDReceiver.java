package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class SerialVersionUIDReceiver {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		//SerialVersionUID id1= new SerialVersionUID();
		FileInputStream fis= new FileInputStream("SerialVersionUid.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerialVersionUID id= (SerialVersionUID) ois.readObject();
		System.out.println(id.i+"_____"+id.j);
		
	}

}