package com.dl.three;

public abstract class Parent {

	static int i = 10;
	static int j = 20;
	
	int a = 100;
	int b = 200;
	
	public static void main(String[] args) {
		
		int x = 1000;
		int y = 2000;
		
		System.out.println(x);
		System.out.println(y);
		
		System.out.println(i);
		System.out.println(j);
		
		//System.out.println(new Parent().a);
		//System.out.println(new Parent().b);
	}
}
