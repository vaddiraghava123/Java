package com.vaddi.java.designpatterns.creationalPattern.singletonPattern;

public class SingletonDesignPattern {

	private static SingletonDesignPattern singletonDesignPatternInstance;// gets memory only once

	// Early Instantiation
	// private static SingletonDesignPattern singletonDesignPatternInstance = new
	// SingletonDesignPattern();// gets memory only once

	private SingletonDesignPattern() {

	}

	public static SingletonDesignPattern getInstance() {
		if (singletonDesignPatternInstance == null) {
			synchronized (singletonDesignPatternInstance) { // first lock
				if (singletonDesignPatternInstance == null) { // second lock
					// Lazy Instantiation
					singletonDesignPatternInstance = new SingletonDesignPattern();
				}
			}
		}
		return singletonDesignPatternInstance;

	}

	public static void main(String[] args) {

	}

}
