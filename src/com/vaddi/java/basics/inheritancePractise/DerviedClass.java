package com.vaddi.java.basics.inheritancePractise;

public class DerviedClass extends BaseClass{
	int val1;
	
	public DerviedClass() {
		System.out.println("DerviedClass Constructor");
	}
	
	public DerviedClass(int x, int y) {
		super(x);
		val1 = y;
	}
	
	public String getMessage() {
		return "DerviedClass Method"+val1 +" :: "+ val;
	}
}
