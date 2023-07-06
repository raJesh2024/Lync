package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {

		// Unary Operators
		int a = 10;
		int b = 20;

		// Post Increment (increase later)
		System.out.println(a++); // 10
		System.out.println(b++); // 20

		System.out.println(a); // 11
		System.out.println(b); // 21

		System.out.println(++a); // 12
		System.out.println(++b); // 22

		int c = 30;
		System.out.println(++c); //31
		System.out.println(c++); //31
		System.out.println(c); // 32
		
	}
}
