package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		//primitive to object
		int i = 10;
		System.out.println("Primitve Type: " + i);
		
		//Parameterized Cons
		Integer integer = new Integer(i);
		System.out.println("Object Type: " + integer);
		
		//valueOf()
		Integer valueOf = Integer.valueOf(i);
		System.out.println("Object Type: " + valueOf);
		
		//Auto boxing
		Integer ii = i;
		System.out.println("Object Type: " + ii);
	}
	
}
