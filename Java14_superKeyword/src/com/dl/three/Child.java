package com.dl.three;

public class Child extends Parent{

	public Child() {
		this(10);
		System.out.println("Child Default Cons");
	}
	
	public Child(int a) {
		super(100);
		System.out.println("Child One-arg Cons " + a);
	}
	
	public Child(int a, int b) {
		super();
	}
	
	public static void main(String[] args) {
		
		new Child();
		new Child(10, 20);
	}
}
