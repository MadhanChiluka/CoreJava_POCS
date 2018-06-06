package com.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException {
		//File file = new File("abc.txt");
		FileReader fileReader = new FileReader("abc.txt");
		char[] ch = new char[(int) new File("abc.txt").length()];
		fileReader.read(ch);
		for (char ch1 : ch) {
			System.out.println(ch1);
		}
	}

}
