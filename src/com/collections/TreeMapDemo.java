package com.collections;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap treeMap = new TreeMap();
		treeMap.put(102, "java");
		treeMap.put(100,"Madhan");
		treeMap.put(101, "Chiluka");
		treeMap.put(103, "Software");
		treeMap.put(105,"Developer");
		System.out.println(treeMap);
		
		TreeMap treeMap2 = new TreeMap(new MapComparator());
		treeMap2.put(102, "java");
		treeMap2.put(100,"Madhan");
		treeMap2.put(101, "Chiluka");
		treeMap2.put(103, "Software");
		treeMap2.put(105,"Developer");
		System.out.println(treeMap2);
		
	}

}
class MapComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String string1 = o1.toString();
		String string2 = o2.toString();
		return -string1.compareTo(string2);
	}
	
}
