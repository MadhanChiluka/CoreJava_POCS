package com.regularexpressions;

import java.util.regex.Pattern;

public class StringSplitRegex {
	public static void main(String[] args) {
		String string= "Madhan Chiluka"; 
		String [] string1 = string.split("\\s");
		for(String string2:string1) {
			System.out.println(string2);
		}
		}

}
