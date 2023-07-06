package com.dl.one;

public class Child extends Parent {

	int a = 100;
	int b = 200;
	
	public static void main(String[] args) {
		
		Child child = new Child();
		child.operations();
	}

	public void operations() {
		
		System.out.println(this.a);
		System.out.println(this.b);
		
		System.out.println(super.a);
		System.out.println(super.b);
	}
}
