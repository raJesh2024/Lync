package com.dl.one;

//PolyMany Forms
//Method Overloading (One class, Method Name must be same, args can be different)
//Method Overriding (Multiple Classes, Method Name must be same, args can be same)
//Operator
public class Eg1 {

	
	public void gasStation(int pPrice, int dPrice) {
		System.out.println("Petrol Price 1: " + pPrice);
		System.out.println("Diesel Price 1: " + dPrice);
	}
	
	public void gasStation(float pPrice, float dPrice) {
		System.out.println("Petrol Price 2: " + pPrice);
		System.out.println("Diesel Price 2: " + dPrice);
	}

	public static void main(String[] args) {

		Eg1 eg1 = new Eg1();
		eg1.gasStation(100, 80);
		eg1.gasStation(100.5f, 80.10f);
	}
}
