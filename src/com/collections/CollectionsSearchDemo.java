package com.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsSearchDemo {

	public static void main(String[] args) {
		ArrayList arrayList = new ArrayList<>();
		arrayList.add("M");
		arrayList.add("A");
		arrayList.add("D");
		arrayList.add("H");
		arrayList.add("A");
		arrayList.add("N");
		System.out.println(arrayList);
		Collections.sort(arrayList);
		System.out.println(arrayList);
		System.out.println(Collections.binarySearch(arrayList, "D"));// binary search works only on sorted list
		System.out.println(Collections.binarySearch(arrayList, "J"));
	}

}
