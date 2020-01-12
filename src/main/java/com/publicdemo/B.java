package com.publicdemo;

public class B {
	public void my() {
		System.out.println(new A().x);
	}

	public static void main(String[] args) {
		System.out.println(new A().x);
		new A().ab();
	}
}
