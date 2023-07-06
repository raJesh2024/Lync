package com.dl.two;

//Multilevel Inheritance
class GrandParent{
	
	public void m1() {
		System.out.println("Grandparent M1 Method");
	}
}

class Parent extends GrandParent{
	
	public void m2() {
		System.out.println("Parent M2 Mehtod");
	}
}

class Child extends Parent{
	
	public void m3() {
		System.out.println("Child M3 Method");
	}
}
public class Client {

	public static void main(String[] args) {
		
		Child child = new Child();
		child.m1(); 
		child.m2();
		child.m3();
	}
}
