package com.regularexpressions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidMobileNumFromFile {
	public static void main(String[] args) throws IOException {
		File file= new File("NumbersFile.txt");
		file.createNewFile();
		PrintWriter printWriter = new PrintWriter("NumbersFile.txt");
		printWriter.println("9030379976");
		printWriter.println("9849664242");
		printWriter.println("6894004242");
		printWriter.println("970043494949");
		printWriter.println("8332914841");
		printWriter.println("6651416455");
		printWriter.println("7207641751");
		printWriter.println("919700434949");
		printWriter.println("07095567250");
		printWriter.flush();
		printWriter.close();
		
		PrintWriter printWriter2 = new PrintWriter("ValidMobileNumFile.txt");
		BufferedReader reader= new BufferedReader(new FileReader("NumbersFile.txt"));
		Pattern pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
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
