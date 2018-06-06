package com.collections;

import java.util.Arrays;

public class ArraysBinarySearch {

	public static void main(String[] args) {
		int[] a = { 10, 2, 20, 11, 6 };
		Arrays.sort(a);
		System.out.println(Arrays.binarySearch(a, 6));
		System.out.println(Arrays.binarySearch(a, 14));
		
		System.out.println();
		String [] string = {"M","A","D","H","A","N"};
		Arrays.sort(string);
		
		System.out.println(Arrays.binarySearch(string, "D"));
		System.out.println(Arrays.binarySearch(string, "K"));
		
		System.out.println();
		Arrays.sort(string, new ArraysComparator());
		System.out.println(Arrays.binarySearch(string, "D", new ArraysComparator() ));
		System.out.println(Arrays.binarySearch(string, "K", new ArraysComparator()));
		
	}

}
