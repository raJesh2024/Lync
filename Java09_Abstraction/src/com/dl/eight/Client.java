package com.dl.eight;

class P1{
	
	public void m1() {
		System.out.println("M1 Method");
	}
}

abstract class P2 extends P1{
	
	public void m2() {
		System.out.println("M2 Method");
	}
}

class P3 extends P2{
	
	public void m3() {
		System.out.println("M3 Method");
	}
}

public class Client {

	public static void main(String[] args) {
		
		P3 p3 = new P3();
		p3.m1(); 
		p3.m2(); 
		p3.m3();

	}

}
