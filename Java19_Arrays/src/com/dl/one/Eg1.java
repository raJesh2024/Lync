package com.dl.one;

public class Eg1 {

	public static void main(String[] args) {
		
		//Declare an array and provide elements to it
		int a[] = {10, 20, 30, 40, 50};
		//          0   1   2   3   4  5
		System.out.println(a); //[I@7e774085
		
		System.out.println(a.length);

		System.out.println(a[0]); //10
		System.out.println(a[1]); //20
		System.out.println(a[2]); //30
		System.out.println(a[3]); //40
		System.out.println(a[4]); //50
		//System.out.println(a[5]); //java.lang.ArrayIndexOutOfBoundsException
		
	}
}
