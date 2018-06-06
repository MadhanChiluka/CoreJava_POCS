package com.collections;

import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {		
		Hashtable hashtable = new Hashtable<>();
		hashtable.put(new Temporary(10), "Madhan");
		hashtable.put(new Temporary(1), "Chiluka");
		hashtable.put(new Temporary(25), "Developer");
		hashtable.put(new Temporary(15), "java");
		hashtable.put(new Temporary(20), "Software");
		System.out.println(hashtable);

	}

}
class Temporary {
	int i;

	public Temporary(int i) {
		super();
		this.i = i;
	}
	

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		
		return i;
	}


	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temporary other = (Temporary) obj;
		if (i != other.i)
			return false;
		return true;
	}*/


	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return i+"";
	}
	
	
	
}