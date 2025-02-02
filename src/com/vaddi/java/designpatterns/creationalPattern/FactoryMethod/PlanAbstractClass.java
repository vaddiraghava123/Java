package com.vaddi.java.designpatterns.creationalPattern.FactoryMethod;

public abstract class PlanAbstractClass {

	protected double rate;
	abstract void getRate();
	
	void calculateBill(int unit) {
		System.out.println("Rate is "+ rate);
		System.out.println("Calculate Bill is :: "+ unit*rate);
	}
}
