package com.javalang;

public class StringClass {

	public static void main(String[] args) {
		String string ="Madhan";
		String string1 = string.concat("Chiluka");
		System.out.println(string);

		String string2 = "Madhan";
		System.out.println(string == string2);
		System.out.println(string.equals(string2));

		StringBuffer buffer = new StringBuffer("Madhan");
		buffer.append("Chiluka");
		System.out.println(buffer);
		StringBuffer buffer1 = new StringBuffer("Madhan");
		System.out.println(buffer.equals(buffer1));
		System.out.println(buffer == buffer1);

		StringBuffer sb = new StringBuffer();
		sb.append("ashok").insert(5, "arunkumar").delete(11, 13).reverse().append("solutions").insert(18, "abcdf").reverse();
		
		System.out.println();
		System.out.println(sb);
		System.out.println();
			
		
		String s1= new String("Spring");
		s1.concat("fall");
		s1= s1+"winter";
		String s2= s1.concat("summer");
		System.out.println(s1);
		System.out.println(s2);
	}

	/*public boolean equals(Object obj) {
		try {
			String stringobj = (String) obj;
			String string1 = stringobj;
			if (string1.equals(stringobj)) {
				return true;
			} else
				return false;
		} catch (ClassCastException ce) {
			return false;
		} catch (NullPointerException ne) {
			return false;
		}

	}*/
}
