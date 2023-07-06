package com.dl.four;

//Constructor Overloading
//Constructor Name must be same as class Name
//Constructor name must be same args must be diff
public class Parent {
	
	public Parent() {
		System.out.println("Default Constructor");
	}
	
	public Parent(int i) {
		
		System.out.println(i);
	}
	
	public Parent(int i, int j) {
		System.out.println(i);
		System.out.println(j);
	}
	
	public static void main(String[] args) {
		
		new Parent();
		new Parent(10);
		new Parent(10, 20);
	}
}
