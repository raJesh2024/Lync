package com.dl.two;

public class Client {

	public static void main(String[] args) {

		UserProfile userOne = new UserProfile("Sai Kiran", "Hyd", 98765433210l, "sai@gmail.com");

		UserProfile[] userOneP = {userOne};
			
		UserDetails userDetails = new UserDetails(1, userOneP);
		userDetails.getDetails();
		
		
	}

}
