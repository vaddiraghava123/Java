package com.vaddi.java.allmainclasses;

import com.vaddi.java.solidprinciple.dependencyInversion.CardType;
import com.vaddi.java.solidprinciple.dependencyInversion.CreditCard;

public class ShoppingCard {
	
	private CardType cardType;
	
	ShoppingCard(CardType cardType) {
		this.cardType = cardType;
	}
	
	public String doTransaction(String card, long amount) {
		return cardType.doTransaction(card, amount);
	}
	
	public static void main(String...args) {
		
		CardType cardType = new CreditCard();
		ShoppingCard shoppingCard = new ShoppingCard(cardType);
		String result = shoppingCard.doTransaction("Credit",20);
		System.out.println(result);
	}

}
