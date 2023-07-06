package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		//Explicit
		//Higher to Lower
		//Double->Float->Long->Integer->Short->Byte
		//--------------------->Char
		
		double d1 = 10;
		
		float f1 = (float)d1;
		System.out.println(f1);
		
		long l1 = (long)d1;
		System.out.println(l1);
		
		int i1 = (int)d1;
		System.out.println(i1);
		
		short s1 = (short)d1;
		System.out.println(s1);
		
		byte b1 = (byte)d1;
		System.out.println(b1);
		
		long l2 = 65;
		char ch = (char)l2;
		System.out.println(ch);
		
		int a = 10;
		int b = 20;
		short l3 = (short)(a+b);
		System.out.println(l3);
		
		long l4 = 10;
		byte b2 = (byte)(short)(int)(long)(float)(double)l4;
		System.out.println(b2);
	}
}
