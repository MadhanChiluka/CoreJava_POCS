package com.collections;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet hashSet = new LinkedHashSet<>();
		hashSet.add("B");
		hashSet.add("C");
		hashSet.add("D");
		hashSet.add("Z");
		hashSet.add(null);
		hashSet.add(10);
		System.out.println(hashSet.add("Z"));
		System.out.println(hashSet);

	}

}
