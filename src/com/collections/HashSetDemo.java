package com.collections;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		HashSet hashSet = new HashSet<>();
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
