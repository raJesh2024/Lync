package com.dl.two;

public class UserDetails {

	public int userId;
	UserProfile[] userProfile; //Data Member //Has A Relationship
	
	
	public UserDetails(int userId, UserProfile[] userProfile) {
		this.userId = userId;
		this.userProfile = userProfile;
	}



	public void getDetails() {
		
		for (UserProfile userProfiles : userProfile) {
			System.out.println(userProfiles.userName);
			System.out.println(userProfiles.userContact);
			System.out.println(userProfiles.userEmail);
			System.out.println(userProfiles.userAddress);
		}
			
	}
	
}
