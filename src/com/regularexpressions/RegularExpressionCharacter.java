package com.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionCharacter {

	public static void main(String[] args) {
		int count = 0;
		System.out.println("Enter String x");
		java.util.Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();

		/*
		 * Where x can be any Character classes
		 * 
		 * x={[abc], [^abc], [a-z], [A-Z], [a-zA-Z], [0-9], [a-zA-Z0-9], [6a-zA-Z0-9]}
		 * 
		 * Predefined character classes
		 * 
		 * x={{\s, \d, \w },{\S, \D, \W}}
		 */

		Pattern pattern = Pattern.compile(x);
		Matcher matcher = pattern.matcher("a1b7@z#");
		while (matcher.find()) {
			count++;
			System.out.println(+matcher.start() + "____" + matcher.group());
		}
		System.out.println("NO of occurances - " + count);
	}

}
