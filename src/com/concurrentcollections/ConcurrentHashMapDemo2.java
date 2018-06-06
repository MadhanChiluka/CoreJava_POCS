package com.concurrentcollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo2 extends Thread {

	static ConcurrentHashMap hashMap = new ConcurrentHashMap<>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		System.out.println("Child thread updating map");
		hashMap.put(103, "C");

	}

	public static void main(String[] args) throws InterruptedException {
		hashMap.put(101, "A");
		hashMap.put(102, "B");
		ConcurrentHashMapDemo2 hashMapDemo2 = new ConcurrentHashMapDemo2();
		hashMapDemo2.start();
		Set set = hashMap.keySet();
		Iterator iterator = set.iterator();
		while (iterator.hasNext()) {
			Integer integer = (Integer) iterator.next();
			System.out
					.println("Main Thread iterating and current Entry is " + integer + "______" + hashMap.get(integer));
			Thread.sleep(3000);
		}
		System.out.println(hashMap);
	}
}
