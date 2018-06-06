package com.serializable;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializationWRTInheritance {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Tiger tiger = new Tiger();
		tiger.parent=100;
		tiger.child= 200;
		System.out.println(tiger.parent+"______"+tiger.child);
		FileOutputStream fos = new FileOutputStream("SerializationWRTInheritance.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(tiger);

		FileInputStream fis  = new FileInputStream("SerializationWRTInheritance.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Tiger tiger2= (Tiger)ois.readObject();
		System.out.println(tiger2.parent+"_____"+tiger2.child);
	}

}
class Carnivorous {
	int parent= 10;
	Carnivorous() {
		System.out.println("Parent Class");
	}
}
class Tiger extends Carnivorous implements Serializable {
int child= 20;
Tiger(){
System.out.println("Child class Constructor");
}
}