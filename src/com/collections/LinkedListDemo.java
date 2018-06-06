package com.collections;

import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList list = new LinkedList<>();
		list.add("Madhan");
		list.add(30);
		list.add(null);
		list.add("Madhan");
		System.out.println(list);
		list.set(0, "Software");
		System.out.println(list);
		list.set(0, "Chiluka");
		System.out.println(list);
		list.removeLast();
		System.out.println(list);
		list.addFirst("Ch");
		System.out.println(list);
	}

}
