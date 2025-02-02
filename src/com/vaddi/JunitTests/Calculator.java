package com.vaddi.JunitTests;

public class Calculator {
	public int sum(int a, int b) {
		System.out.println("Sum is");
		return a + b ;
	}
	
	public int divide( int a , int b) {
		System.out.println("Divide ..");
		if( b == 0 ) {
			throw new IllegalArgumentException("Division by zero");
		}
		return a / b;
	}
	
	public String reverse(String input) {
		 return new StringBuilder(input).reverse().toString();
    }

    public boolean isPalindrome(String input) {
        String reversed = reverse(input);
        return input.equals(reversed);
    }
}
