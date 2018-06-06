package com.collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CustomizedComparator {

	public static void main(String[] args) {
		Employee employee = new Employee("Madhan", 412);
		Employee employee2 = new Employee("Chiluka", 411);
		Employee employee3 = new Employee("Software", 414);
		Employee employee4 = new Employee("Developer", 415);
		Employee employee5 = new Employee("java", 413);

		TreeSet treeSet = new TreeSet();
		treeSet.add(employee);
		treeSet.add(employee2);
		treeSet.add(employee3);
		treeSet.add(employee4);
		treeSet.add(employee5);
		System.out.println(treeSet);

		TreeSet treeSet1 = new TreeSet(new MyCustomizedComparator());
		treeSet1.add(employee);
		treeSet1.add(employee2);
		treeSet1.add(employee3);
		treeSet1.add(employee4);
		treeSet1.add(employee5);
		System.out.println(treeSet1);

	}

}

class MyCustomizedComparator implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		Employee employee1 = (Employee) o1;
		Employee employee2 = (Employee) o2;
		String string1 = employee1.name;
		String string2 = employee2.name;
		return string1.compareTo(string2);
	}

}