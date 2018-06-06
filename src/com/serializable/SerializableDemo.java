package com.serializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializableDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Dog dog = new Dog();
		Cat cat = new Cat();
		FileOutputStream fos = new FileOutputStream("Serializable.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(dog);
		oos.writeObject(cat);

		FileInputStream fis = new FileInputStream("Serializable.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Object obj1 = ois.readObject();

		if (obj instanceof Dog) {
			Dog dog2 = (Dog) obj;
			System.out.println(dog2.i + "______" + dog2.j);
		} else if (obj instanceof Cat) {
			Cat cat2 = (Cat) obj;
			System.out.println(cat2.i + "_______" + cat2.j);
		}

		if (obj1 instanceof Dog) {
			Dog dog2 = (Dog) obj1;
			System.out.println(dog2.i + "____" + dog2.j);
		} else if (obj1 instanceof Cat) {
			Cat cat2 = (Cat) obj1;
			System.out.println(cat2.i + "______" + cat2.j);
		}

	}
}

class Dog implements Serializable {
	static transient int i = 10;
	int j = 20;
}

class Cat implements Serializable {
	int i = 30;
	final transient int j = 40;
}