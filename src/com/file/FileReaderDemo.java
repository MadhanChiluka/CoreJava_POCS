package com.file;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {
	
		FileReader fileReader = new FileReader("abc.txt");
		int data=fileReader.read();
		while(data!=-1) {
			System.out.println((char)data);
			data=fileReader.read();
		}
	}

}
