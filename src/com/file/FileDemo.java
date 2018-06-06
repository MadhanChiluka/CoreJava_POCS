package com.file;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {
		int count = 0;
		File file = new File("F:\\Madhan\\EclipseWorkspace\\CoreJava\\Madhan_files", "def.txt");
		file.createNewFile();

		File file1 = new File("Madhan_files");
		String[] s = file1.list();
		for (String s1 : s) {
			File file2 = new File(file1, s1);
			if (file2.isDirectory()) {
				System.out.println(s1);
				count++;
			}
		}
		System.out.println(count);
	}

}
