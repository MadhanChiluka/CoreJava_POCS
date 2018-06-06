package com.collections;

import java.util.TreeSet;

public class NavigableSetDemo {

	public static void main(String[] args) {
		TreeSet set = new TreeSet<>();
		set.add(1000);
		set.add(1200);
		set.add(1400);
		set.add(1600);
		set.add(2000);
		System.out.println(set);
		System.out.println(set.ceiling(1200));
		System.out.println(set.floor(3000));
		System.out.println(set.higher(1500));
		System.out.println(set.pollFirst());
		System.out.println(set.pollLast());
		System.out.println(set.descendingSet());

	}

}
