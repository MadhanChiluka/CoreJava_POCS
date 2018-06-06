package com.regularexpressions;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class QuantifierRegex {
	public static void main(String[] args) {
		System.out.println("Enter String x");
		Scanner scanner = new Scanner(System.in);
		String x = scanner.nextLine();

		/*
		 * Where x can be any Quantifier
		 * 
		 * x={a , a+, a* , a?}
		 */

		Pattern pattern = Pattern.compile(x);
		Matcher matcher = pattern.matcher("abaabaaab");
		while (matcher.find()) {
			System.out.println(matcher.start() + "_____" + matcher.end() + "_____" + matcher.group());
		}
	}

}