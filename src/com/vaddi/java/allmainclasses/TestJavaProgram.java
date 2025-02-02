package com.vaddi.java.allmainclasses;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class TestJavaProgram {

	public static void main(String... v) {
		int a = 10,b=20;
		int c = a +b;
		System.out.println("a +b ="+":"+c);
		
		//StreamPlay s = new StreamPlay();
		
		List<Integer> values = Arrays.asList(1,1,2,2,3,1,1,3,1,1,1,4);

		int count = 0;
		for(int i =0;i<values.size();i++) {
			
			int temp = values.get(i);
			
			if(i <= values.size()-2) {
				if(temp == values.get(i+1) && temp == values.get(i+2)) {
						count++;			
				} 	
			}
		}
		System.out.println("values ... "+ count);

		
		String[] names = {"Tom","Jam","Cam"};
		List<String> namesList = Arrays.asList(names);
		
		
		namesList.stream().forEach(System.out::println);
		
		String str = (String) System.in.toString();
		/*
		 * Scanner scanner = new Scanner(System.in);
		 * 
		 * System.out.println("Enter a number from 10 to 9999: "); int number =
		 * scanner.nextInt();
		 * System.out.println(isPalindrome(Integer.toString(number)));
		 */
	       
		int num1 = 5;
		
		for(int i =1; i<=num1;i++) {
			for (int j=i; j<num1 ; j++) {
				System.out.print(" ");
			}
				for(int k=1; k<= (2 * i - 1); k++) {
					System.out.print("*");
				}
				System.out.println();
			
		}
		int rows = 5;
		for (int i = 1; i <= rows; i++) {
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("C");
            }
            System.out.println();
        }
	}
	
	 public static String isPalindrome(String str) {
   	  for (int i = 0; i < str.length() / 2; i++) {
   		System.out.println("i " + i + " str.length() / 2 :" + str.length() / 2 + " str.charAt(i) " + str.charAt(i) +
   				"str.length() - 1 - i " + str.length() + "str.charAt(str.length() - 1 - i) " + str.charAt(str.length() - 1 - i));
   	    if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
   	      return "Not a Specail Character";
   	    }
   	  }
   	  return "Special character";
   	}

	private static void testMethod(String str) {
		
		int firstVal = str.charAt(0);
		int lastVal = str.charAt(str.length()-1);
		
		if(firstVal == lastVal) {
			System.out.println("Special character");
		} else {
			System.out.println("Not a Specail Character");
		}
	}
}
