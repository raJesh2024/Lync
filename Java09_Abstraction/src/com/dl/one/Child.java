package com.dl.one;

public class Child extends Parent {

	@Override
	public void m1() {
		
		System.out.println("M1 Method Implementd");

	}

	public static void main(String[] args) {
		
//		Child child = new Child();
//		child.m1();
//		child.m2();
		
		Parent parent = new Child();
		parent.m1();
		parent.m2();
		
	}
}
