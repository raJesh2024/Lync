package com.dl.one;

public class RegitserImpl extends Register {

	public static void main(String[] args) {
		
		RegitserImpl impl = new RegitserImpl();
		impl.setUserName("sai kiran");
		impl.setUserEmail("sai@gmail.com");
		impl.setUserContact(98765432310L);
		impl.setUserSalary(10000.00);
		
		System.out.println(impl.getUserName());
		System.out.println(impl.getUserEmail());
		System.out.println(impl.getUserContact());
		System.out.println(impl.getUserSalary());
		
	}
}
