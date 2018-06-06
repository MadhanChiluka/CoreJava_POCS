package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class InheritanceSerialization {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Lion lion = new Lion();
		System.out.println(lion.i+"______"+lion.j);
		FileOutputStream fos = new FileOutputStream("InheritanceSerialization.txt");
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		oos.writeObject(lion);
		
		FileInputStream fis = new FileInputStream("InheritanceSerialization.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Lion lion2 = (Lion)ois.readObject();
		System.out.println(lion2.i+"_________"+lion2.j);
	}
}

class Animal implements Serializable {
	int i = 10;
}
class Lion extends Animal {
	int j= 20;
}