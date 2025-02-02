package com.vaddi.java.basics.inheritancePractise;

public class BaseClass {

	int val;
	public BaseClass() {
		System.out.println("Base Class Constructor");
	}
	
	BaseClass(int x) {
		val = x;
	}
	
	public String getMessage() {
		return "Base class Method" +val;
	}
}
