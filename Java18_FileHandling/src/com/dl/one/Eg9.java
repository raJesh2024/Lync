package com.dl.one;

import java.util.Scanner;

public class Eg9 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter userName: ");
		String username = scanner.nextLine();
		System.out.println(username);
		
		System.out.println("Enter user Salary");
		double salary = scanner.nextDouble();
		System.out.println(salary);
		
		System.out.println("Enter user age: ");
		int age = scanner.nextInt();
		System.out.println(age);
		scanner.close();
	}
}
