package com.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaIdentifierRegex {
	public static void main(String[] args) {
		System.out.println("Enter the input to check it is a valid Java Identifier");
		Scanner scanner = new Scanner(System.in);
		String input=scanner.nextLine();
		Pattern pattern = Pattern.compile("[a-zA-z][a-zA-Z0-9-#]+");
		Matcher matcher = pattern.matcher(input) ;
		if(matcher.find()&&matcher.group().equals(input)) {
			System.out.println("Valid Java Identifier");
		}
		else 
			System.out.println("Invalid Java Identifier");
	}
}
