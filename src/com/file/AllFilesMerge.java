package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class AllFilesMerge {

	public static void main(String[] args) throws IOException {
		File file= new File("AllFilesMerge.txt");
		file.createNewFile();
		File file1= new File("F:\\Madhan\\EclipseWorkspace\\CoreJava\\Madhan_files");
		PrintWriter printWriter = new PrintWriter("AllFilesMerge.txt");
		
		String[] s= file1.list();
		for(String s1:s) {
			System.out.println(s1);
			BufferedReader buffer = new BufferedReader(new FileReader(new File(file1,s1)));
			String line=buffer.readLine();
			while(line!=null) {
				printWriter.println(line);
				line=buffer.readLine();
			}
			
			buffer.close();
			
		}
		printWriter.flush();
		printWriter.close();
		
	}

}
