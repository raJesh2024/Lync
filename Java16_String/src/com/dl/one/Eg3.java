package com.dl.one;

public class Eg3 {

	public static void main(String[] args) {
		
		String s1 = new String("Java and Python");
		System.out.println(s1.startsWith("J")); //true
		System.out.println(s1.startsWith("P")); //false
		System.out.println(s1.startsWith("Java")); //true
		
		System.out.println(s1.endsWith("on")); //true
		System.out.println(s1.endsWith("Python")); //true
		System.out.println(s1.endsWith("Java")); //false
		
		String s2 = new String("Java and Python");
		System.out.println(s2.contains("and")); //true
		System.out.println(s1.contains("is")); //false
		
	}
}
