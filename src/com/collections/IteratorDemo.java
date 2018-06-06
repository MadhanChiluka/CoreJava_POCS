package com.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		for (int i= 0; i<10;i++) {
			list.add(i);
		}
		Iterator iterator= list.iterator();
		while(iterator.hasNext()) {
			Integer integer= (Integer) iterator.next();
			if(integer%2==0) {
				System.out.println(integer);
			}
			else iterator.remove();
		}
		System.out.println(list);

	}

}
