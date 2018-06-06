package com.collections;

import java.util.Arrays;
import java.util.Comparator;

public class ArraySortDemo {

	public static void main(String[] args) {
		int[] a = { 10, 2, 20, 11, 6 };
		System.out.println("Primitive values before sorting");
		for (int i : a) {
			System.out.println(i);
		}
		Arrays.sort(a);
		System.out.println("Primitive aftr sorting");
		for (int i : a) {
			System.out.println(i);
		}
		
		String [] string = {"M","A","D","H","A","N"};
		System.out.println("Object before sorting");
		for (String s1:string) {
			System.out.println(s1);
		}
		Arrays.sort(string);
		System.out.println("Object after sorting");
		for (String s1:string) {
			System.out.println(s1);
		}
		
		Arrays.sort(string, new ArraysComparator());
		System.out.println("Object after customized sorting");
		for (String s1:string) {
			System.out.println(s1);
		}
		
	}

}
class ArraysComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
	String string1 = o1.toString();
	String string2 = o2.toString();
		return string2.compareTo(string1);
	}
	
}
