package com.concurrentcollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo extends Thread {
	static CopyOnWriteArrayList arrayList = new CopyOnWriteArrayList<>();

	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException ie) {
		}
		System.out.println("Child Thread updating");
		arrayList.add("R");
	}

	public static void main(String[] args) throws InterruptedException {
		ArrayList arrayList1 = new ArrayList<>();
		arrayList1.add("A");
		arrayList1.add("C");

		arrayList.add("A");
		arrayList.add("A");
		arrayList.addIfAbsent("B");
		arrayList.addIfAbsent("B");
		arrayList.addAll(arrayList1);
		System.out.println(arrayList);

		CopyOnWriteArrayListDemo listDemo = new CopyOnWriteArrayListDemo();
		listDemo.start();
		Iterator iterator = arrayList.iterator();
		while (iterator.hasNext()) {
			String string = (String) iterator.next();
			if(string.equals("B")) {
				iterator.remove();
			}
			System.out.println("Main Thread Iterating List and Current Object is " + string);
			Thread.sleep(3000);
		}System.out.println(arrayList);

	}

}
