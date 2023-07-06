package com.dl.one;

//Instance Method
public class Eg1 {

	public static void main(String[] args) {
		
		Eg1 eg1 = new Eg1();
		eg1.add(); 
		eg1.update();
		
		Eg1 eg2 = new Eg1();
		eg2.add(); 
		eg2.update();
		
		Eg1 eg3 = new Eg1();
		eg3.add(); 
		eg3.update();
		
		new Eg1().add();
		new Eg1().update();
		
	}
	
	//Instance Method
	public void add() {
		
		System.out.println("Add Method");
		
	}
	
	//Instance Method
	public void update() {
		
		System.out.println("Update Method");
	}
}
