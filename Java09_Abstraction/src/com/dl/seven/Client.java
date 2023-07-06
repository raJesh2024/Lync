package com.dl.seven;

abstract class Parent {

	public abstract void m1();

	public abstract void m2();

	public abstract void m3();

	public abstract void m4();

}

abstract class Child extends Parent {

	@Override
	public void m1() {

		System.out.println("M1 Method");

	}

	@Override
	public void m2() {
		System.out.println("M2 Method");

	}

}

class Childern extends Child {

	@Override
	public void m3() {
		System.out.println("M3 Method");

	}

	@Override
	public void m4() {
		System.out.println("M4 Method");

	}

}

public class Client {

	public static void main(String[] args) {

		Childern childern = new Childern();
		childern.m1();
		childern.m2();
		childern.m3();
		childern.m4();
	}

}
