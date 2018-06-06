package com.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ConcurrentNeedDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add("A");
		list.add("Madhan");
		list.add("D");
		list.add("Chiluka");
		System.out.println(list);
		Iterator iterator = list.iterator();
		while(iterator.hasNext()) {
			String string=(String) iterator.next();
			System.out.println(string);
			list.add("F");
		}

	}

}
