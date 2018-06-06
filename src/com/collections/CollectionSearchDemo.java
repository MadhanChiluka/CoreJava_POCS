package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionSearchDemo {

	public static void main(String[] args) {
		ArrayList list = new ArrayList<>();
		list.add(10);
		list.add(15);
		list.add(5);
		list.add(20);
		list.add(25);
		System.out.println(list);
		Collections.sort(list, new CollectionSearchComparator());
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		System.out.println(Collections.binarySearch(list, 15, new CollectionSearchComparator()));
		System.out.println(Collections.binarySearch(list, 23));

	}

}
class CollectionSearchComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer integer1= (Integer) o1;
		Integer integer2= (Integer) o2;
		return integer2.compareTo(integer1);
	}
	
}
