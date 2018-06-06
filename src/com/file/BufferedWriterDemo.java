package com.file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		BufferedWriter buffer = new BufferedWriter(new FileWriter("pqr.txt"));
		buffer.write("Madhan ");
		buffer.write(99);
		buffer.append('h');
		char[] ch= {'i','l','u','k','a'};
		buffer.write(ch);
		buffer.newLine();
		buffer.write("Software Developer");
		buffer.flush();
		buffer.close();
		
	}

}
