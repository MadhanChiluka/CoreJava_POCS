package com.collections;

import java.util.TreeMap;

public class NavigableMapDemo {

	public static void main(String[] args) {
		TreeMap<String,String> treeMap= new TreeMap<String,String>();
		treeMap.put("A", "Apple");
		treeMap.put("B", "Ball");
		treeMap.put("C", "Cat");
		treeMap.put("D","Dog");
		treeMap.put("E", "Elephant");
		System.out.println(treeMap);
		
		System.out.println(treeMap.ceilingKey("C"));
		System.out.println(treeMap.floorKey("D"));
		System.out.println(treeMap.higherKey("D"));
		System.out.println(treeMap.pollFirstEntry());
		System.out.println(treeMap.pollLastEntry());
		System.out.println(treeMap.descendingKeySet());
		System.out.println(treeMap.descendingMap());
		System.out.println(treeMap);
		

	}

}
