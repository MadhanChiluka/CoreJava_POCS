package com.regularexpressions;

import java.util.regex.Pattern;

public class PatternSplitRegex {

	public static void main(String[] args) {
		Pattern pattern = Pattern.compile("\\s");
		//   "\\." or [.]
		String[] string = pattern.split("Madhan Software Developer");
		for (String string1: string) {
			System.out.println(string1);
		}
		
	}

}
