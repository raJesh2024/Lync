package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		new Eg3();
	}
	
	static{
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
}
