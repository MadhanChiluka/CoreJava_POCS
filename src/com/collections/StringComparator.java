package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class StringComparator {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet(new MyComparator3());
		treeSet.add("Madhan");
		treeSet.add("Chiluka");
		treeSet.add("Java");
		treeSet.add("Software");
		treeSet.add("Developer");
		System.out.println(treeSet);
	}

}
class MyComparator3 implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		String string1 = (String) o1;
		String string2 = (String) o2;
		//return string1.compareTo(string2);
		//return -string1.compareTo(string2);
		return string2.compareTo(string1);
	}
	
}

