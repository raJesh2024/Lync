package com.dl.one;

//Single Level Inheritance (Is A Relationship)
public class Child extends Parent {

	
	public int add(int a, int b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		System.out.println(child.add(10, 20));
		child.add();
		
		put();
		
	}
	
}
