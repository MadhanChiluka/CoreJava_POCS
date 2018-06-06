package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class CollectionsSortDemo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		arrayList.add("M");
		arrayList.add("A");
		// arrayList.add(10);
		arrayList.add("D");
		arrayList.add("H");
		arrayList.add("A");
		arrayList.add("N");
		System.out.println("Before Sorting");
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println("After sorting");
		System.out.println(arrayList);

		ArrayList arrayList2 = new ArrayList<>();
		arrayList2.add("Madhan");
		arrayList2.add("Chiluka");
		arrayList2.add("Java");
		arrayList2.add("Web");
		arrayList2.add("Developer");
		System.out.println("Before Sorting");
		System.out.println(arrayList2);
		System.out.println("After sorting");
		Collections.sort(arrayList2, new CollectionsComparator());
		System.out.println(arrayList2);

	}

}
class CollectionsComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String string1 = (String) o1;
		String string2 = (String) o2;
		return string2.compareTo(string1);
		
	}
	
}
