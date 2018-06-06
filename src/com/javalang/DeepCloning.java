package com.javalang;

public class DeepCloning {
	public static void main(String[] args) throws CloneNotSupportedException {
		Cat2 cat2 = new Cat2(30);
		Dog2 dog1 = new Dog2(cat2, 20);
		System.out.println(dog1.cat2.j + "_______" + dog1.i);
		Dog2 dog2 = (Dog2) dog1.clone();
		dog2.i = 888;
		dog2.cat2.j = 999;
		System.out.println(dog2.i + "_______" + dog2.cat2.j);
		System.out.println(cat2.j);
		System.out.println(cat2.getClass().getName());
	}

}

class Cat2 {
	int j;

	Cat2(int j) {
		this.j = j;
	}
}

class Dog2 implements Cloneable {
	Cat2 cat2;
	int i;

	Dog2(Cat2 cat2, int i) {
		this.cat2 = cat2;
		this.i = i;
	}

	public Object clone() throws CloneNotSupportedException {
		Cat2 cat = new Cat2(cat2.j);
		Dog2 dog= new Dog2(cat, i);
		return dog;
	}
}
