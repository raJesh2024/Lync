package com.dl.one;

import java.io.FileWriter;
import java.io.IOException;

public class Eg3 {

	public static void main(String[] args) throws IOException {
		
		FileWriter writer = new FileWriter("/Users/admin/Documents/sajeed/CoreJava13/camel.txt");
		writer.write("Hello Java and Hello Python");
		writer.close();
		System.out.println("File Created and Data Inserted");

	}

}
