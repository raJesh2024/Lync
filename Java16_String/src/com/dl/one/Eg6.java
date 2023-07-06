package com.dl.one;

public class Eg6 {

	public static void main(String[] args) {
		
		String s1 = new String("I like Java and I like Python and I like JavaScript");
		//                      01234567..........18
		System.out.println(s1.lastIndexOf("like")); //36
		
		System.out.println(s1.indexOf("like")); //2
		
		System.out.println(s1.indexOf("like", 5)); //18
		
		String s2 = "Java";
		System.out.println(s2.toUpperCase()); //JAVA
		System.out.println(s2.toLowerCase()); //java
	}
}
