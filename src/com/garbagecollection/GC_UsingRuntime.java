package com.garbagecollection;

import java.util.Date;

public class GC_UsingRuntime {

	public static void main(String[] args) {
		Runtime runtime= Runtime.getRuntime();
		System.out.println("Total Memory of the heap " +runtime.totalMemory());
		System.out.println("Free Memory of the heap " +runtime.freeMemory());
		for (int i=0; i<10000 ; i++) {
			Date date= new Date();
			date=null;
		}
		System.out.println("Free Memory of the heap "+runtime.freeMemory());
		runtime.gc();
		System.out.println("Free Memory of the heap "+runtime.freeMemory());

	}

}
