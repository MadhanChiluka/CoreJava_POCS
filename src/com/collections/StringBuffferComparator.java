package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class StringBuffferComparator {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparator4());
		treeSet.add(new StringBuffer("Madhan"));
		treeSet.add(new StringBuffer("Chiluka"));
		treeSet.add(new StringBuffer("Java"));
		treeSet.add(new StringBuffer("Software"));
		treeSet.add(new StringBuffer("Developer"));

		System.out.println(treeSet);
	}

}

class MyComparator4 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String string1 = o1.toString();
		String string2 = o2.toString();
		return string1.compareTo(string2);
	}

}
