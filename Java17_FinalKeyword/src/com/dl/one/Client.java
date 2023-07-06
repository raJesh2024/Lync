package com.dl.one;

//final class : no inheritance
//final var : cannot re-assign
//final method : cannot override
class Parent{
	
	public void m1() {
		final int id = 10;
		//id = 20; 
		System.out.println(id);
	}
	
	public final void m2() {
		System.out.println("M2 Method");
	}
	
}

class Child extends Parent{
	
//	public void m2() {
//		System.out.println("M2 Method");
//	}
	
}
public class Client {

	public static void main(String[] args) {
		
		new Parent().m1();
	}
}
