package com.dl.one;

public class Eg6 {

	public void m1(int a, int b) {
		
		System.out.println(a + " and " + b);
	}
	
	public static void m2(int x, int y) {
		
		System.out.println(x + " and " + y);
	}
	
	public static void main(String[] args) {
		
		Eg6 eg6 = new Eg6();
		eg6.m1(10, 20);
		eg6.m1(30, 40);
		eg6.m1(50, 60);
		
		m2(100, 200);
		m2(300, 400);
		m2(500, 600);
	}
}
