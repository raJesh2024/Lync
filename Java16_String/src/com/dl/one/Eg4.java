package com.dl.one;

public class Eg4 {

	public static void main(String[] args) {
		
		String s1 = new String("Java");
		System.out.println(s1.replace("J", "j")); //java
		
		String s2 = new String("Python");
		System.out.println(s2.replace("Python", "Java")); //Java
		
		String s3 = new String("Java Programming Java Programs");
		System.out.println(s3.replace("Pro", "pro")); //Java programming Java programs
		
		System.out.println(s3.replaceAll("a", "A")); //JAvA ProgrAmming JAvA ProgrAms
		
		System.out.println(s3.replaceFirst("P", "p")); //Java programming Java Programs
		
	}
}
