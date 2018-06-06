package com.serializable;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ExternalizableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Externalisation externalisation= new Externalisation("Madhan",10,20);
		System.out.println(externalisation.s+"_____"+externalisation.i+"______"+externalisation.j);
		
		FileOutputStream fos = new FileOutputStream("Externalisation.txt");
		ObjectOutputStream oos =new ObjectOutputStream(fos);
		oos.writeObject(externalisation);
		
		FileInputStream fis = new FileInputStream("Externalisation.txt");
		ObjectInputStream ois = new  ObjectInputStream(fis);
		Externalisation externalisation2=(Externalisation) ois.readObject();
		
		System.out.println(externalisation2.s+"______"+externalisation2.i+"______"+externalisation2.j);
	}

}
class Externalisation implements Externalizable {
	String s;
	int i;
	int j;
	public Externalisation() {
		System.out.println("Public no-arg Constructor");
	}

	public Externalisation(String s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(s);
		out.writeInt(j);
		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
		s=(String) in.readObject();
		j=in.readInt();
		
	}
	
}