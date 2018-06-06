package com.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMailIDRegex {
 
	public static void main(String[] args) {
		System.out.println("Enter Mail ID");
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		Pattern pattern = Pattern.compile("[a-zA-z][a-zA-z0-9_.]+@[a-zA-Z0-9]+([.][a-zA-Z]+)+");
		Matcher matcher= pattern.matcher(input);
		if(matcher.find() && matcher.group().equals(input)) {
			System.out.println("Valid Mail ID");
		}
		else
			System.out.println("Invalid Mail ID");
	}

}
