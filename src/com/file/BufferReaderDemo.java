package com.file;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferReaderDemo {

	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new FileReader("pqr.txt"));
		
		String line= buffer.readLine();
		while(line!=null) {
			System.out.println(line);
			
			line= buffer.readLine();
		
		}
		buffer.close();
	}

}
