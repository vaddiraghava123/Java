package com.vaddi.java.solidprinciple.dependencyInversion;

public class DebitCard implements CardType {
	
	@Override
	public String doTransaction(String cardType, long amount) {
		return "Paid by " + cardType +" Card";
	}

}
