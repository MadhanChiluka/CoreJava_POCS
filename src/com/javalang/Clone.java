package com.javalang;

public class Clone implements Cloneable{
 int i=10;
 int j=20;
 public int hashCode() {
	 return i;
 }
 
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Clone clone= new Clone();
		Clone clone2 = (Clone) clone.clone();
		System.out.println(clone2.i);
		System.out.println(clone2.j);
		/*clone2.i=888;
		clone2.j=999;*/
		System.out.println(clone.i);
		System.out.println(clone.j);
		System.out.println(clone2.i);
		System.out.println(clone2.j);
		System.out.println(clone.equals(clone2));
		System.out.println(clone.hashCode()+"______"+clone2.hashCode());
		System.out.println(clone==clone2);

	}

}
