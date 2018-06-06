package com.collections;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector vector = new Vector<>();
		System.out.println(vector.capacity());
		for (int i=0;i<10;i++) {
			vector.add(i);
		}
		System.out.println( vector);
		System.out.println(vector.capacity());
		vector.add("A");
		System.out.println(vector.size());
		System.out.println(vector.capacity());
		System.out.println(vector);
		}

}
