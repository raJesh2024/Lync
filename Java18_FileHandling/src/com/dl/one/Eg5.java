package com.dl.one;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;

public class Eg5 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		
		FileReader reader = new FileReader("one.txt");
		int i;
		while ((i=reader.read()) !=-1) 
			System.out.print((char)i);
		reader.close();
		
		System.out.println();
		
		FileInputStream stream = new FileInputStream("one.txt");
		int j;
		while ((j=stream.read()) !=-1) 
			System.out.print((char)j);
		reader.close();
	}
}
