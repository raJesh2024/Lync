package com.dl.one;

import java.io.FileOutputStream;
import java.io.IOException;

public class Eg4 {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("one.txt");
		String s1 = "Hello Java and Hello Python";
		byte[] bytes = s1.getBytes();
		fileOutputStream.write(bytes);
		System.out.println("New File Created and Data Inserted");
		fileOutputStream.close();
		
	}
}
