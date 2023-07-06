package com.dl.one;

//Static Method
public class Eg2 {

	public static void main(String[] args) {

		put();
		delete();
		
		Eg2.put();
		Eg2.delete();
		
		Eg2.put();
		Eg2.delete();
		
		Eg2.put();
		Eg2.delete();
		
	}
	
	//Static Method
	public static void put() {

		System.out.println("Put Method");
	}
	
	//Static Method
	public static void delete() {

		System.out.println("Delete Method");
	}

}
