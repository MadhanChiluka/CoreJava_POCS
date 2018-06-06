package com.regularexpressions;

import java.util.StringTokenizer;

public class StringTokenizerDemo {

	public static void main(String[] args) {
		StringTokenizer tokenizer = new StringTokenizer("Madhan Software Developer");
		while (tokenizer.hasMoreTokens()) {
			System.out.println(tokenizer.nextToken());
		}
		StringTokenizer tokenizer2 = new StringTokenizer("1,99,988", ",");
		while (tokenizer2.hasMoreTokens()) {
			System.out.println(tokenizer2.nextToken());
		}
	}

}
