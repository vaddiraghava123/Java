package com.vaddi.java.allmainclasses;

import com.vaddi.java.basics.inheritancePractise.BaseClass;
import com.vaddi.java.basics.inheritancePractise.DerviedClass;

public class InheritancePractise    {

	public static void main(String[] args) {

		BaseClass derviedClass = new DerviedClass();
		System.out.println(derviedClass.getMessage());
		
		BaseClass derviedClass2 = new BaseClass();
		System.out.println(derviedClass2.getMessage());
		
		BaseClass derBaseClass = new DerviedClass(30, 40);
		System.out.println(derBaseClass.getMessage());
		
	}
}
