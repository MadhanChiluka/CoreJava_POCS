package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class StringLengthComparator {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparator5());
		treeSet.add("Madhan");
		treeSet.add(new StringBuffer("Ch"));
		treeSet.add(new StringBuffer("Java"));
		treeSet.add("Soft");
		treeSet.add(new StringBuffer("Developer"));

		System.out.println(treeSet);
	}

}
class MyComparator5 implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String string1 = o1.toString();
		String string2 = o2.toString();
		Integer i1= string1.length();
		Integer i2= string2.length();
		if (i1<i2) {
			return -1;
		}
		else if (i1>i2) {
			return +1;
		}
		else return string1.compareTo(string2);
		}

	
}

	