package com.collections;

public class Employee implements Comparable {
	String name;
	int eid;

	public Employee(String name, int eid) {
		super();
		this.name = name;
		this.eid = eid;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Employee [name=" + name + ", eid=" + eid + "]";
	}

	@Override
	public int compareTo(Object o) {
		int eid1 = this.eid;
		int eid2 = ((Employee) o).eid;
		if (eid1 < eid2) {
			return -1;
		}
		if (eid1 > eid2) {
			return +1;
		}
		return 0;

	}

}
