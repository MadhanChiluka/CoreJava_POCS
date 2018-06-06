package com.javalang;

public class ToString {
	String name;
	int rollno;

	public ToString(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}

	public int hashCode() {
		return rollno;
	}

	/*public boolean equals(Object obj) {

		try {
			ToString string = (ToString) obj;
			String name2 = string.name;
			int rollno2 = string.rollno;

			if (name.equals(name2) && rollno == rollno2) {
				return true;
			} else
				return false;

		} catch (ClassCastException ce) {
			return false;
		} catch (NullPointerException neS) {
			return false;
		}
	}*/

	/*public boolean equals(Object obj) {
		if(this==obj) {
			return true;
		}
		if(obj instanceof ToString) {
			ToString string= (ToString) obj;
			if(name.equals(string.name)&& rollno==string.rollno)
				return true;
			else return false;
		}
		return false;
		}
	*/
	
	public static void main(String args[]) {
		ToString string1 = new ToString("Madhan", 101);
		ToString string2 = new ToString("Chiluka", 102);
		ToString string3 = new ToString("Himaamshu", 103);
		ToString string4 = string1;
		ToString string5 = new ToString("Madhan", 101);
		System.out.println(string1.hashCode());
		System.out.println(string1.equals(string2));
		System.out.println(string2.equals(string3));
		System.out.println(string3.equals(string4));
		System.out.println(string4.equals(string1));
		System.out.println(string5.hashCode());
		System.out.println(string1.equals(string5));
		System.out.println(string1==string5);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "ToString [name=" + name + ", rollno=" + rollno + "]";
	}

}
