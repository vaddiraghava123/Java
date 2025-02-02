package com.vaddi.java.designpatterns.creationalPattern.FactoryMethod;

public class DomesticeBill extends PlanAbstractClass{

	@Override
	void getRate() {
		rate = 3.5;
	}

}
