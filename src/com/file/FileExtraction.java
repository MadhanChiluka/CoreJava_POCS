package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class FileExtraction {

	public static void main(String[] args) throws IOException {
		File file= new File("FileExtraction.txt");
		file.createNewFile();
		
		PrintWriter printWriter = new PrintWriter("FileExtraction.txt");
		BufferedReader buffer = new BufferedReader(new FileReader("AllFilesMerge.txt"));
		String target= buffer.readLine();
		while(target!=null) {
			boolean available= false;
			BufferedReader buffer1= new BufferedReader(new FileReader("F:\\Madhan\\EclipseWorkspace\\CoreJava\\Madhan_files\\def.txt"));
			String line= buffer1.readLine();
			while(line!=null) {
				if (target.equals(line)) {
					available=true;
					break;
				}
				line= buffer1.readLine();
			}
			if(available==false) {
				printWriter.println(target);
			}
			target=buffer.readLine();
			printWriter.flush();
			
		}
		
		
	}

}
 