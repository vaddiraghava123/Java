package com.vaddi.java.solidprinciple.dependencyInversion;

public class CreditCard implements CardType{
	
	@Override
	public String doTransaction(String cardType, long amount) {
		return "Paid by " + cardType +" Card";
	}

}
