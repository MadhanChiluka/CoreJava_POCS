package com.serializable;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerialVersionUIDSender {

	public static void main(String[] args) throws IOException {
		SerialVersionUID id= new SerialVersionUID();
		FileOutputStream fos = new FileOutputStream("SerialVersionUid.txt");
		ObjectOutputStream oos = new  ObjectOutputStream(fos);
		oos.writeObject(id);
	}

}
