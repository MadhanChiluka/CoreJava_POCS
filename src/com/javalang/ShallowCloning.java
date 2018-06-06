package com.javalang;

public class ShallowCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat cat = new Cat(10);
		Dog dog = new Dog(cat, 20);
		System.out.println(dog.cat.j+ "_______" + dog.i);
		Dog dog2 = (Dog) dog.clone();
		dog2.i = 888;
		dog2.cat.j = 999;
		System.out.println(dog2.i + "_______" + dog2.cat.j);
		System.out.println(cat.j);
	}

}

class Cat {
	int j;

	Cat(int j) {
		this.j = j;
	}
}

class Dog implements Cloneable {
	Cat cat;
	int i;

	Dog(Cat cat, int i) {
		this.cat = cat;
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException {
		return super.clone();

	}
}