package com.protecteddemo;

public class B extends A{

	public static void main(String[] args) {
		System.out.println(new B().x);// x acts as public
		System.out.println(new A().x);// x acts as public
	}
}

class C {

	public static void main(String[] args) {
		System.out.println(new A().x);// x acts as public
		System.out.println(new B().x);// x acts as public
	}
}
