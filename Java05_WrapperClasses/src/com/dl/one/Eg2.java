package com.dl.one;

public class Eg2 {

	public static void main(String[] args) {
		
		//Object typer to Primitive type
		//Para
		Integer i = new Integer(10);
		System.out.println("Object Type: " + i);
		int intValue = i.intValue();
		System.out.println( "Primitive Value: " +intValue);
		
		//Auto un-boxing
		Integer ii = new Integer(20);
		System.out.println("Object Type: " + ii);
		Integer iii = i;
		System.out.println("Primitive Value: " + iii);
		
		
	}
}
