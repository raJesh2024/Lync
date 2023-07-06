package com.dl.six;

abstract class Parent{
	
	public Parent() {
		System.out.println("Deafult Cons P");
	}
}

class Child extends Parent{
	
	public Child() {
		System.out.println("Child Cons C");
	}
}

public class Client {

	public static void main(String[] args) {
		
		new Child();
	}
}
