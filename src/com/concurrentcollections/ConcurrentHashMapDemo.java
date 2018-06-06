package com.concurrentcollections;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		ConcurrentHashMap hashMap = new ConcurrentHashMap<>();
		
		hashMap.put(101, "Durga");
		hashMap.put(102, "Ravi");
		System.out.println(hashMap);
		
		hashMap.putIfAbsent(101, "Pavan");
		System.out.println(hashMap);
		
		hashMap.remove(101,"Sanjay");
		System.out.println(hashMap);
		
		hashMap.remove(102, "Ravi");
		System.out.println(hashMap);
		
		hashMap.put(102, "Ravi");
		
		hashMap.replace(101, "Ravi", "Pavan");
		System.out.println(hashMap);
		
		hashMap.replace(102, "Ravi", "Pavan");
		System.out.println(hashMap);

	}

}
 