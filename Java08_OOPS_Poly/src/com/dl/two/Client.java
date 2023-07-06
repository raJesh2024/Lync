package com.dl.two;

//Method Overriding
class RBI {

	public int getRateofInterest() {

		return 0;

	}
}

class SBI extends RBI{
	
	public int getRateofInterest() {

		return 2;

	}
}

class AXIS extends RBI{
	
	public int getRateofInterest() {

		return 3;

	}
}

class ICICI extends RBI{
	
	public int getRateofInterest() {

		return 3;

	}
}

public class Client {

	public static void main(String[] args) {
		
		SBI sbi = new SBI();
		System.out.println(sbi.getRateofInterest());
		
		ICICI icici = new ICICI();
		System.out.println(icici.getRateofInterest());
		
		AXIS axis = new AXIS();
		System.out.println(axis.getRateofInterest());
		
	}
}
