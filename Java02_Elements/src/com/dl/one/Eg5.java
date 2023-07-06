package com.dl.one;

public class Eg5 {

	// Main Method
	public static void main(String[] args) {

		System.out.println("Main Method");

		new Eg5().m1();

		m2();
		
		System.out.println(new Eg5().m3());
		System.out.println(new Eg5().sendRequest());

	}

	// Instance Method
	public void m1() {
		System.out.println("Instance Method");
	}

	// Static Method
	public static void m2() {
		System.out.println("Static Method");
	}

	//return type is int
	public int m3() {
		return 0;
	}
		
	//return type is String
	public String sendRequest() {
		
		return "Http Request Sent";
		
	}

}
