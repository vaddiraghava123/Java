package com.vaddi.java.designpatterns.creationalPattern.singletonPattern;

public class Singleton {
	
	private static Singleton obj = null;
	private Singleton() {
		
	}
	
	public static synchronized Singleton createInstance() {
		if(obj == null) {
			obj = new Singleton();
		}
		return obj;
	}

}
