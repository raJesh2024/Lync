package com.dl.one;

public class Eg9 {

	public static void main(String[] args) {
		
		//immutable
		String s1 = new String("Java");
		
		String s2 = s1.concat("Python");
		System.out.println(s2); //JavaPython
		
		String s3 = s1.concat("JavaScript");
		System.out.println(s3); //JavaJavaScript
		
		System.out.println(s1); //Java
		
		//Mutable, Thread Safety, 1.0
		StringBuffer sb1 = new StringBuffer("Java");
		sb1.append("Python");
		System.out.println(sb1); //JavaPython
		
		//Mutable, No Thread Safety, 1.5
		StringBuilder sb2 = new StringBuilder("Java");
		sb2.append("Python");
		System.out.println(sb2); //JavaPython
		
		
	}

}
