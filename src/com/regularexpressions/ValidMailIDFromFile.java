package com.regularexpressions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMailIDFromFile {

	public static void main(String[] args) throws IOException {
		PrintWriter printWriter = new PrintWriter("AllMailIds.txt");
		printWriter.println("madhan.chiluka@gmail.com");
		printWriter.println("madhan.chiluka@");
		printWriter.println("chilukamadhan@gmail.com");
		printWriter.println("1madhanfd@gmail.com");
		printWriter.println("madhan_chiluka@gmail.co.in");
		printWriter.println("madhan@gmakdf");
		printWriter.println("madhandfjsdk");
		printWriter.println("madhan411@GMAIL.");
		printWriter.println("madhan@.");    
		printWriter.flush();
		printWriter.close();
		
		PrintWriter printWriter2 = new PrintWriter("ValidMailIDs.txt");
		BufferedReader reader= new BufferedReader(new FileReader("AllMailIds.txt"));
		Pattern pattern = Pattern.compile("[a-zA-z][a-zA-z0-9._]+@[a-zA-z0-9]+([.][a-zA-Z]+)+");
		String line=reader.readLine();
		while(line!=null) {
			
			Matcher matcher= pattern.matcher(line);
			while(matcher.find()) {
				printWriter2.println(matcher.group());
			}
			line=reader.readLine();
		}printWriter2.flush();
		
	}


}
