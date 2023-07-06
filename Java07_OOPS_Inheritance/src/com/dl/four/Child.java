package com.dl.four;

//Hierarchical
class GrandParent{
	
	public void m1() {
		System.out.println("M1 Method");
	}
	
}

class Parent extends GrandParent{
	
	public void m2() {
		System.out.println("M2 Method");
	}
}

public class Child extends GrandParent{

	public void m3() {
		System.out.println("M3 Method");
	}
	
	public static void main(String[] args) {
		
		Parent parent = new Parent();
		parent.m1();
		parent.m2();
		
		Child child = new Child();
		child.m1(); 
		child.m3();
		
	}
}
