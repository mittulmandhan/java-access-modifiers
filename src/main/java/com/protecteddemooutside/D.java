package com.protecteddemooutside;

import com.protecteddemo.A;

public class D extends A {
	// now x acts as private member
	public void my() {

	}

	public static void main(String[] args) {
		System.out.println(new D().x); // x is private
		//System.out.println(new A().x); // cant access 
	}
}
