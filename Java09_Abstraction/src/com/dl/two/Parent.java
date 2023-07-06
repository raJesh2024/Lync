package com.dl.two;

public abstract class Parent {

	static {
		System.out.println("Static Block");
	}
	
	{
		System.out.println("Instance Block");
	}
	
	public static void main(String[] args) {
		
		//Parent p = new Parent(); // Cannot instantiate the type Parent
	}
}
