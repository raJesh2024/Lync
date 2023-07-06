package com.dl.one;

public class Eg5 {

	public static void main(String[] args) {
		
		int a = 7;
		
		if(a %2 == 0) {
			System.out.println("Even Number");
		}else {
			System.out.println("Odd Number");
		}
		

		if(true) {
			
			System.out.println("If Condition");
			if(true) {
				System.out.println("Nested If Condition 01");
			}
			if(false) {
				System.out.println("Nested If Condition 02");
			}
			if(true) {
				System.out.println("Nested If Condition 03");
			}
		}
		
	}
}
