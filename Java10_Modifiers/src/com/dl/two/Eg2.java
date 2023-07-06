package com.dl.two;

import com.dl.one.Eg1;

public class Eg2 {
	
	public void m2() {
		System.out.println("M2 Method");
	}

	public static void main(String[] args) {
		
		new Eg2().m2();
		
		new Eg1().m1();
	}
}
