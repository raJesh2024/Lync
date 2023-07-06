package com.dl.three;

public class Eg1 {

	public static void main(String[] args) {
		
		for (int i = 0; i < 10; i++) {
			
			if (i == 7) {
				//break; //stop iteration
				continue; //skips iteration
			}
			System.out.println(i);
		}

	}

}
