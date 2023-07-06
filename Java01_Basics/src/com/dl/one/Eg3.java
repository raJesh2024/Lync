package com.dl.one;

public class Eg3 {
	
	//Instance Variables / Non Static
	byte b;
	short s;
	int i;
	long l;
	
	boolean bb;
	
	double d;
	float f;
	
	char ch;

	public static void main(String[] args) {
		
		//Instance
		//new Object(); 
		//eg3 is object reference variable
		Eg3 eg3 = new Eg3();

		System.out.println(eg3.b);
		System.out.println(eg3.s);
		System.out.println(eg3.i);
		System.out.println(eg3.l);
		System.out.println(eg3.bb);
		System.out.println(eg3.d);
		System.out.println(eg3.f);
		System.out.println(eg3.ch);
	}
}
