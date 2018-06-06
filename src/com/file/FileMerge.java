package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMerge {

	public static void main(String[] args) throws IOException {
		File file = new File("FileMerge.txt");
		file.createNewFile();
	PrintWriter printWriter = new PrintWriter("FileMerge.txt");
	BufferedReader buffer = new BufferedReader(new FileReader("def.txt"));
	String line=buffer.readLine();
	while(line!=null) {
		printWriter.println(line);
		line=buffer.readLine();
		
	}
	BufferedReader buffer1 = new BufferedReader(new FileReader("F:\\Madhan\\EclipseWorkspace\\CoreJava\\Madhan_files\\xyz.txt"));
	line=buffer1.readLine();
	while(line!=null) {
		printWriter.println(line);
		line=buffer1.readLine();
	}
	buffer.close();
	buffer1.close();
	printWriter.flush();
	printWriter.close();

	}

}
