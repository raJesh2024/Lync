package com.dl.two;

public class Child extends Parent {

	public void m1() {
		System.out.println("M1 Method Child");
	}
	
	public void m3() {
		this.m1();
		super.m1();
		super.m2();
	}
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.m3();
		
	}
}


