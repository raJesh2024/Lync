package com.dl.two;

//this keyword to invoke current class method
public class Client {

	public void add() {
		this.update();
		System.out.println("add method");
	}
	
	public void update() {
		this.delete();
		System.out.println("update method");
	}
	
	public void delete() {
		System.out.println("delete method");
	}
	
	public static void main(String[] args) {
		
		Client client = new Client();
		client.add();
	}
}
