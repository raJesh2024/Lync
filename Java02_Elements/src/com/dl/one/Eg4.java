package com.dl.one;

public class Eg4 {
	
	//Instance V / Static V
	String userName = "Sai Kiran";
	String contact = "98765433210";
	static String address = "Hyd";

	public static void main(String[] args) {
		
		System.out.println("Main Method: " + new Eg4().userName);
		System.out.println("Main Method: " + new Eg4().contact);
		System.out.println("Main Method: " + address);
		
		System.out.println("----------------------------------");
		
		new Eg4().getUserDetails();
		
		System.out.println("----------------------------------");
		getUserDetailsTwo();

	}
	
	//Instance Method
	public void getUserDetails() {
		
		System.out.println("Instance Method: " + userName);
		System.out.println("Instance Method: " + contact);
		System.out.println("Instance Method: " + address);
	}
	
	//Static Method
	public static void getUserDetailsTwo() {
		
		System.out.println("Static Method: " + new Eg4().userName);
		System.out.println("Static Method: " + new Eg4().contact);
		System.out.println("Static Method: " + address);
	}
	
	

}
