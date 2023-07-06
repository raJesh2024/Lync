package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		//Implicit Casting
		//Lower to Higher
		//Byte->Short->Integer->Long->Float->Double
		//------------>Char
		
		byte b1 = 10;
		
		short s1 = b1;
		System.out.println(s1);
		
		int i1 = s1;
		System.out.println(i1);
		
		long l1 = i1;
		System.out.println(l1);
		
		float f1 = l1;
		System.out.println(f1);
		
		double d1 = f1;
		System.out.println(d1);
		
		char ch = 'A';
		int i2 = ch;
		System.out.println(i2); //65
		
		
	}
}
