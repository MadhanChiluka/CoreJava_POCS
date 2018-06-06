package com.collections;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
		Vector vector = new Vector<>();
		System.out.println(vector.capacity());
		for (int i=0;i<10;i++) {
			vector.add(i);
		}
		System.out.println( vector);
		
		Enumeration enumeration = vector.elements();
		while(enumeration.hasMoreElements())
		{
			Integer integer = (Integer)enumeration.nextElement();
			//System.out.println(integer);
			if(integer%2==0) {
				System.out.println(integer);
			}
		}

	}

}
