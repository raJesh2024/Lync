package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		
		String s1 = "Java Python JavaScript";
		String[] split = s1.split(" ");
		for (String string : split) {
			System.out.println(string);
		}
		
		String s2 = "Java:Python:JavaScript";
		String[] split2 = s2.split(":");
		for (String string : split2) {
			System.out.println(string);
		}
		
		String s3 = "Java-Python-JavaScript";
		String[] split3 = s3.split("-");
		for (String string : split3) {
			System.out.println(string);
		}
		
		String s4 = "JavaandPythonandJavaScript";
		String[] split4 = s4.split("and");
		for (String string : split4) {
			System.out.println(string);
		}
		
		String s5 = "Java and Python and JavaScript";
		String[] split5 = s5.split(" ", 5);
		for (String string : split5) {
			System.out.println(string);
		}
	}
}
