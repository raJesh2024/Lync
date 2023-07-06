package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		String s1 = new String("Hello Java and Hello Python");
		char[] charArray = s1.toCharArray();
		charArray[6] = 'j';
		charArray[7] = 'A';
		System.out.println(charArray);
		
		String s2 = new String("Programming");
		//                      01234......
		System.out.println(s2.charAt(0));
		System.out.println(s2.charAt(4));
		System.out.println(s2.charAt(20)); //java.lang.StringIndexOutOfBoundsException:
		
	}
}
