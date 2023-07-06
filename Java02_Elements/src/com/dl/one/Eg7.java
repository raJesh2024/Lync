package com.dl.one;

public class Eg7 {

	public static void main(String[] args) {
		
		Eg7 cutomer1 = new Eg7();
		cutomer1.customerDetails(1, "Sai Kiran", "saikiran@gmail.com", 98765432110L, "Hyd");
		bankDetails("ICICI", "Hyd");
		
		Eg7 cutomer2 = new Eg7();
		cutomer2.customerDetails(2, "Sai Krishna", "saikrishna@gmail.com", 98765432110L, "Hyd");
		bankDetails("ICICI", "Hyd");
		
		Eg7 cutomer3 = new Eg7();
		cutomer3.customerDetails(3, "Abhi", "abhi@gmail.com", 98765432110L, "Hyd");
		bankDetails("ICICI", "Hyd");
		
	}
	
	public void customerDetails(int cId, String customerName, String customerEmail, long customerContactNo, String customerAddress) {
		
		System.out.println("Customer Id: " + cId);
		System.out.println("Customer Name: " + customerName);
		System.out.println("Customer Mail: " + customerEmail);
		System.out.println("Customer Contact: " + customerContactNo);
		System.out.println("Customer Address: " + customerAddress);
		
	}
	
	public static void bankDetails(String bankName, String banKAddress) {
		
		System.out.println("Bank Name: " + bankName);
		System.out.println("Bank Address: " + banKAddress);
		System.out.println("");
	}

}

//Pascal // Class
//Camel //variable and method
//Snake //user_name