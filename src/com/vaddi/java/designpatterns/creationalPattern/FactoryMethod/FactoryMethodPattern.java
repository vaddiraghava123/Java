package com.vaddi.java.designpatterns.creationalPattern.FactoryMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactoryMethodPattern {

	/**
	 * Factory Method or Factory Pattern also called Virtual Constructor
	 * Define interface or abstract for creating the objects
	 * but let decide the subclass which class to be instantiated.
	 * 
	 * Advantage - Loose coupling
	 * @throws IOException 
	 */

	public static void main(String...args) throws IOException {
		GeneratePlanFactory generatePlanFactory = new GeneratePlanFactory();
		
		System.out.print("Enter the name of plan for which the bill will be generated: ");  
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));  
		String planName=br.readLine();  
		
		System.out.print("Enter the number of units for bill will be calculated: ");  
		int units=Integer.parseInt(br.readLine());  

		PlanAbstractClass planAbstractClass  =generatePlanFactory.getPlan(planName);

		System.out.print("Bill amount for "+planName+" of  "+units+" units is: ");  		
		planAbstractClass.getRate(); // IMP - with out this abstract method , the bill will not calculate.
		planAbstractClass.calculateBill(units);
	}

}
