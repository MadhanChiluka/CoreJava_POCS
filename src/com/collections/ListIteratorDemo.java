package com.collections;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add("Madhan");
		list.add("Chiluka");
		list.add("Software");
		list.add("Developer");
		System.out.println(list);
		ListIterator listIterator = list.listIterator();
		while(listIterator.hasNext()) {
			String string= (String) listIterator.next();
			System.out.println(string);
			if(string.equals("Chiluka")) {
				listIterator.set("Ch");

			}
			if (string.equals("Chiluka")) {
				listIterator.add("Java");
			}
			
		}System.out.println( list);

	}

}
