package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		String s1 = new String("A");
		String s2 = new String("B");
		String s3 = new String("A");
		
		System.out.println(s1.compareTo(s2)); //-1 // 65-66 =-1
		System.out.println(s1.compareTo(s3)); //0  // 65-65 = 0
		System.out.println(s2.compareTo(s3)); //1  //66-65  = 1
		
		String s4 = new String("A");
		String s5 = new String("a");
		System.out.println(s4.compareTo(s5)); // -32 //65-97 = -32
		System.out.println(s4.compareToIgnoreCase(s5)); // 0
	}

}
