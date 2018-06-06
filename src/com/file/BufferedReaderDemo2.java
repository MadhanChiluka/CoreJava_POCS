package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo2 {

	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new FileReader("def.txt"));
		String line=bufferedReader.readLine();
		while(line!=null) {
			System.out.println(line);
			line=bufferedReader.readLine();
		}
	}

}
