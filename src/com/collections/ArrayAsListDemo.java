package com.collections;

import java.util.Arrays;
import java.util.List;

public class ArrayAsListDemo {

	public static void main(String[] args) {
		String[] string = { "A", "C", "W" };
		List list = Arrays.asList(string);
		System.out.println(list);
		list.set(1, "M");
		System.out.println(list);
		string[0] = "B";
		System.out.println(list);
		for (String s1 : string) {
			System.out.println(s1);
		}
		/*
		 * list.add("V"); 
		 * list.remove(2); 
		 * list.set(1, new Integer(10));
		 */
		System.out.println(list);
	}

}
