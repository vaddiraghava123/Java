package com.vaddi.java.designpatterns.creationalPattern.FactoryMethod;

public class GeneratePlanFactory {

	//compare the subclass and then instantiate
	public PlanAbstractClass getPlan(String planType) {
		if(planType == null ) {
			return null;
		}
		if(planType.equals("Domestic")) {
			System.out.println("Plan Type is ::" + planType);
			return new  DomesticeBill();
		} else if(planType.equalsIgnoreCase("Commericial")) {
			System.out.println("Plan Type is ::" + planType);
			return new CommericalBill();
		}
		return null;
	}
}
