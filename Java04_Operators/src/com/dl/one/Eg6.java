package com.dl.one;

public class Eg6 {

	//Logical Operators &&(both conditions must satisfy) || (any one conditions must satisfy)
	public static void main(String[] args) {
		
		System.out.println(true && true);
		System.out.println(false && true);
		System.out.println(true && false);
		System.out.println(false && false);
		
		System.out.println(true || true);
		System.out.println(false || true);
		System.out.println(true || false);
		System.out.println(false || false);
		
		//Bitwise Exclusive
		System.out.println(true ^ true);
		System.out.println(false ^ true);
		System.out.println(true ^ false);
		System.out.println(false ^ false);
		
		//Bitwise AND
		System.out.println(true & true);
		System.out.println(false & true);
		System.out.println(true & false);
		System.out.println(false & false);
		
		//Bitwise AND
		System.out.println(true | true);
		System.out.println(false | true);
		System.out.println(true | false);
		System.out.println(false | false);
		
		
		
	}
	
}
