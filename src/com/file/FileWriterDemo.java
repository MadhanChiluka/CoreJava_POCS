package com.file;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {
		FileWriter fileWriter= new FileWriter("abc.txt");
		fileWriter.write(100);
		fileWriter.write("urga\nSoftware Solutions");
		fileWriter.write("\n");
		char [] ch = {'a' ,'b', 'c'};
		fileWriter.write(ch);
		fileWriter.append('d');
		fileWriter.flush();
		fileWriter.close();
		
		
		
		
		
		
	}

}
