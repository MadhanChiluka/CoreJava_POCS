package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetComparator2 {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparator2());
		treeSet.add(10);
		treeSet.add(05);
		treeSet.add(15);
		treeSet.add(20);
		treeSet.add(9);
		System.out.println(treeSet);

	}

}
class MyComparator2 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Integer integer1 = (Integer) o1;
		Integer integer2 = (Integer) o2;
		return integer1.compareTo(integer2);
		//return -integer1.compareTo(integer2);
		//return integer2.compareTo(integer1);
		//return +1;
		//return -1;
		//return 0;
		
	}
	
}
