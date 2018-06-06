package com.regularexpressions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionDemo {

	public static void main(String[] args) {
		int count= 0;
		Pattern pattern = Pattern.compile("ab");
		Matcher matcher = pattern.matcher("ababbbabc");
		while(matcher.find())
		{
			count++;
			System.out.println(matcher.start()+"____"+matcher.end()+"____"+matcher.group());
		}
		System.out.println("No of occurences - "+count);
	}

}
