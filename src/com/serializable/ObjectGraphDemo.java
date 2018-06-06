package com.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class ObjectGraphDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Elephant elephant = new Elephant();
		FileOutputStream fos= new FileOutputStream("ObjectGraph.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(elephant);
		
		FileInputStream fis = new FileInputStream("ObjectGraph.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Elephant elephant2 = (Elephant) ois.readObject();
		System.out.println(elephant2.rat.ant.j);
		
	}
 
}
class Elephant implements Serializable {
	Rat rat= new Rat();
}
class Rat implements Serializable {
	Ant ant= new Ant();
	
}
class Ant implements Serializable{
	int j= 20;
}