package com.collections;

import java.util.HashMap;
import java.util.IdentityHashMap;

public class IdentityHashMapDemo {

	public static void main(String[] args) {
		HashMap hashMap = new HashMap();
		Integer integer1 = new Integer(10);
		Integer integer2 = new Integer(10);
		Integer integer3 = new Integer(10);
		hashMap.put(integer1, "Madhan");
		hashMap.put(integer2, "Chiluka");
		System.out.println(hashMap);
		
		IdentityHashMap hashMap2 = new IdentityHashMap<>();
		hashMap2.put(integer1,"Madhan");
		hashMap2.put(integer3, "Chiluka");
		hashMap2.put(integer2,"Madhan");
		System.out.println(hashMap2);
	}
}