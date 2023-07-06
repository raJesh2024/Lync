package com.dl.three;

//this and this()
//this keyword refers to the current class cons
public class Profile {

	public Profile() {
		this(10);
		System.out.println("Default Cons");
	}
	
	public Profile(int a) {
		this(100, 200);
		System.out.println(a);
	}
	
	public Profile(int a, int b) {
		
		System.out.println(a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		new Profile();
	}
}
