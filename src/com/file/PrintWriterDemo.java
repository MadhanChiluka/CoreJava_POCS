package com.file;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {

	public static void main(String[] args) throws IOException {
		PrintWriter printWriter= new PrintWriter(new FileWriter("def.txt"));
		printWriter.print("Madhan ");
		printWriter.append("Chiluka");
		printWriter.println();
		printWriter.print('S');
		printWriter.print("oftware ");
		char [] ch = {'D'};
		printWriter.print(ch);
		printWriter.print("eveloper");
		printWriter.flush();
		printWriter.close();
		
	}

}
