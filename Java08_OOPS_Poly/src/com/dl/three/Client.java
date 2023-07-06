package com.dl.three;

class Parent{
	
	public void m1(int a, int b) {
		System.out.println("Parent: " + a +  ", "  + b);
	}
}

class Child extends Parent{
	
	public void m1(int a, int b) {
		System.out.println("Child: " + a +  ", "  + b);
	}
}

public class Client {

	public static void main(String[] args) {
		
//		Child child = new Child();
//		child.m1(10, 20);
		
		Parent parent  = new Child();
		parent.m1(10, 20);
		
	}
}
