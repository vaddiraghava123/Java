package com.vaddi.java.allmainclasses;

import java.util.ArrayList;
import java.util.Arrays;

public class TestingBasicJava {

	public static void main(String[] args) {
		//FirstClass f = new SecondClass();
		//System.out.println(f.add() + s.add("Val"));
		
		String[] s2 = new String[2];
		ArrayList s1 = new ArrayList();
		
		String text ="trtretr";
		for(int i=0;i<text.length();i++) {
			char c = text.charAt(i);
			int asciiValue = c;
			if(isPrime(asciiValue)) {
				char c1 = (char)asciiValue;
				System.out.println("Is Prime" + asciiValue +":"+ c1);
			}
		}
		//Convert String to String[]
		String[] strArray = new String[] {"a","c","s","c"};
		System.out.println("Is Duplicate" + duplicateValues(strArray));
		
	}
	
	private static <T> boolean duplicateValues(final T[] strArray) {
		System.out.println("11..."+Arrays.stream(strArray).distinct().count() + ":: "+strArray.length);
		return Arrays.stream(strArray).distinct().count() != strArray.length;
		
	}

	public static boolean isPrime(int c) {
		if(c <=1 ) {
			return false;
		}
		for(int i=2;i <= Math.sqrt(c);i++) {
			if(c%i ==0) {
				return false;
			}
		}
		return true;
	}

	public class FirstClass {
		public String add() {
			return "FirstClass";
		}
		
		private int count = 0;

	    public FirstClass() {
	        count++;
	    }

	    public  int getCount() {
	        return count;
	    }
		
	}
	
	public  class SecondClass extends FirstClass {
		public String add() {
			return "Second Class";
		}
		
		public String add(String a) {
			return "Override";
		}
	}
	
	public interface i {
		public static final String str="s";
		public abstract void a();
		
	}
}


