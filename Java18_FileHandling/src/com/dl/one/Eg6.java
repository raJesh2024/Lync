package com.dl.one;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Eg6 {

	public static void main(String[] args) throws IOException {

		System.out.println("Enter any number: ");
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String readLine = reader.readLine();
		int parseInt = Integer.parseInt(readLine);
		System.out.println(parseInt);
		reader.close();

	}
}
