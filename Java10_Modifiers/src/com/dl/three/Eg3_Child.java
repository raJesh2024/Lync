package com.dl.three;

public class Eg3_Child extends Eg3{
	
	void m2() {
		System.out.println("M2 Method");
	}

	public static void main(String[] args) {
		
		new Eg3_Child().m2();
		new Eg3_Child().m1();
		

	}

}
