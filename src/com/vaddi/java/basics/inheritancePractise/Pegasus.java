package com.vaddi.java.basics.inheritancePractise;

public class Pegasus extends Horse implements Flyer, Mythical{
	public static void main(String[] args) {
		Pegasus inheritancePractise = new Pegasus();
		System.out.println(inheritancePractise.identifyMyself());
		
	}
	
}
