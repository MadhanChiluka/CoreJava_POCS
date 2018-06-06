package com.collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) throws IOException {
		Properties properties= new Properties();
		FileInputStream fis= new FileInputStream("F:\\Madhan\\EclipseWorkspace\\CoreJava\\Madhan_files\\db.properties");
		properties.load(fis);
		String User=properties.getProperty("user");
		String Password = properties.getProperty("password");
		String Name = properties.getProperty("name");
		String ID = properties.getProperty("id");
		System.out.println(User+"____"+Password+"____"+Name+"____"+ID);
		
		FileOutputStream fos= new FileOutputStream("db.properties");
		properties.store(fos, "Updated");
		
	}

}
