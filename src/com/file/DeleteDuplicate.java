package com.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class DeleteDuplicate {

	public static void main(String[] args) throws IOException {
		File file= new File("DeletedDuplicateFile.txt");
		file.createNewFile();
		
		PrintWriter printWriter = new PrintWriter("DeletedDuplicateFile.txt");
		BufferedReader buffer = new BufferedReader(new FileReader("Duplicate.txt"));
		
		String target= buffer.readLine();
		while (target!=null) {
			boolean available=false;
			BufferedReader buffer2 = new BufferedReader(new FileReader("DeletedDuplicateFile.txt"));
			String line=buffer2.readLine();
			while(line!=null) {
			if(target.equals(line))
			{
				available=true;
				break;
			}
			line= buffer2.readLine();
			}
			if (available==false) {
				printWriter.println(target);
				printWriter.flush();
			}
			target=buffer.readLine();
			}
	
	}
}


