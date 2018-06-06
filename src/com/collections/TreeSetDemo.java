package com.collections;

import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet treeSet = new TreeSet<>();
		treeSet.add("A");
		treeSet.add("a");
		treeSet.add("B");
		treeSet.add("Z");
		treeSet.add("L");
		/*
		 * treeSet.add(new Integer(10); treeSet.add(10); treeSet.addAll(null);
		 */
		System.out.println(treeSet);

		/*
		 *  TreeSet treeSet2 = new TreeSet<>(); 
		 *  treeSet2.add(new StringBuffer("A"));  
		 *  treeSet2.add(new StringBuffer("a")); 
		 *  treeSet2.add(new StringBuffer("B"));  
		 *  treeSet2.add(new StringBuffer("Z"));
		 *  treeSet2.add(new StringBuffer("L")); 
		 *  System.out.println(treeSet2);
		 */ }

}
