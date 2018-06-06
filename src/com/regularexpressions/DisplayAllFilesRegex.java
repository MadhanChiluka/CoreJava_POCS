package com.regularexpressions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DisplayAllFilesRegex {

	public static void main(String[] args) throws FileNotFoundException {
		int count=0;
		PrintWriter printWriter= new PrintWriter("AllFilesInfo.txt");
		Pattern pattern = Pattern.compile("[a-zA-Z0-9$_-]+[.]txt");
		File file = new File("F:\\Madhan\\EclipseWorkspace\\CoreJava");
		String [] files=file.list();
		for (String eachFile:files) {
			Matcher matcher= pattern.matcher(eachFile);
			if(matcher.find() && matcher.group().equals(eachFile)) {
				count++;
				printWriter.println(eachFile);
				System.out.println(eachFile);
			}
		}
		System.out.println(count);
		printWriter.flush();
	}

}
