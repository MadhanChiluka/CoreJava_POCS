package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator{

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparator());
		treeSet.add(10);
		treeSet.add(05);
		treeSet.add(15);
		treeSet.add(20);
		treeSet.add(9);
		System.out.println(treeSet);

	}

}

class MyComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer integer1 = (Integer) o1;
		Integer integer2 = (Integer) o2;
		if (integer1<integer2) {
			return-1;
		}
		if (integer1>integer2) {
			return+1;
		}
		else
		return 0;
	}
	
}
