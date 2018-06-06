package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileMergeAlternative {

	public static void main(String[] args) throws IOException {
		File file= new File("FileMergeAlternative.txt");
		file.createNewFile();
		
		PrintWriter printWriter = new PrintWriter("FileMergeAlternative.txt");
		BufferedReader buffer1 = new BufferedReader(new FileReader("def.txt"));
		BufferedReader buffer2 = new BufferedReader(new FileReader("F:\\Madhan\\EclipseWorkspace\\CoreJava\\Madhan_files\\xyz.txt"));
		String line1=buffer1.readLine();
		String line2=buffer2.readLine();
		while(line1!=null || line2!=null) {
			if(line1!=null) {
			printWriter.println(line1);
			line1=buffer1.readLine();
			}
			if (line2!=null) {
			printWriter.println(line2);
			line2= buffer2.readLine();
			}
		}
		printWriter.flush();
		buffer1.close();
		buffer2.close();
		printWriter.close();
	
	}

}