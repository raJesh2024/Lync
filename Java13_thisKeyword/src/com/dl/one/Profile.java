package com.dl.one;

//this keyword referees to the current class instance v
public class Profile {
	
	//instance v
	public String userName;
	public String userEmail;
	public long userContact;
	public double userSalary;
	public String address;
	
	//Parameterized cons
	public Profile(String userName, String userEmail, long userContact, double userSalary, String address) {
		this.userName = userName;
		this.userEmail = userEmail;
		this.userContact = userContact;
		this.userSalary = userSalary;
		this.address = address;
	}
	
//	public Profile(String userName, String userEmail, long userContact, double userSalary, String address) {
//		userName = userName;
//		userEmail = userEmail;
//		userContact = userContact;
//		userSalary = userSalary;
//		address = address;
//	}
	
//	public Profile(String uName, String uEmail, long uContact, double uSalary, String add) {
//		userName = uName;
//		userEmail = uEmail;
//		userContact = uContact;
//		userSalary = uSalary;
//		address = add;
//	}
	
	//instance method
	public void display() {
		
		System.out.println(userName);
		System.out.println(userEmail);
		System.out.println(userContact);
		System.out.println(userSalary);
		System.out.println(address);
		
	}
	
	public static void main(String[] args) {
		
		Profile profile = new Profile("Sai Kiran", "sai@gmail.com", 9876543210L, 10000.00, "Hyd");
		profile.display();
	}
	
}
