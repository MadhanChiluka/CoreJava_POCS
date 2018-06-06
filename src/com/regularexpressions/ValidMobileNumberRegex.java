package com.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumberRegex {
	public static void main(String[] args) {
		System.out.println("Enter Mobile Number");
		Scanner scanner= new Scanner(System.in);
		String input=scanner.nextLine();
		Pattern pattern = Pattern.compile("(0|91)?[789][0-9]{9}");
		Matcher matcher=pattern.matcher(input);
		if (matcher.find() && matcher.group().equals(input)) {
			System.out.println("Valid Mobile Number");
		}
		else
			System.out.println("Invalid Mobile Number");
	}

}
