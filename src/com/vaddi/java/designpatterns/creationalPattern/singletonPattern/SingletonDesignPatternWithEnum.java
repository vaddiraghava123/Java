package com.vaddi.java.designpatterns.creationalPattern.singletonPattern;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonDesignPatternWithEnum implements Serializable, Cloneable {

	private static SingletonDesignPatternWithEnum singletonDesignPatternInstance;// gets memory only once

	// Early Instantiation
	// private static SingletonDesignPattern singletonDesignPatternInstance = new
	// SingletonDesignPattern();// gets memory only once

	private SingletonDesignPatternWithEnum() {
		// Protect Reflection

		if (singletonDesignPatternInstance != null) {
			throw new IllegalStateException("Singleton instance already created");
		}

	}

	public static synchronized SingletonDesignPatternWithEnum getInstance() {
		if (singletonDesignPatternInstance == null) {
			// Lazy Instantiation
			singletonDesignPatternInstance = new SingletonDesignPatternWithEnum();
		}
		return singletonDesignPatternInstance;

	}

	private Object readResolve() {
		return singletonDesignPatternInstance;
	}

	protected Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException("Singleton cloning not allowed");
	}

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		SingletonDesignPatternWithEnum singletonDesignPatternWithEnum = new SingletonDesignPatternWithEnum();
		SingletonDesignPatternWithEnum singletonDesignPatternWithEnum2 = new SingletonDesignPatternWithEnum();

		System.out.println("Singleton instance 1" + singletonDesignPatternWithEnum.hashCode());
		System.out.println("Singleton instance 2" + singletonDesignPatternWithEnum2.hashCode());

		System.out.println("Singleton instance without Enum"
				+ (singletonDesignPatternWithEnum.hashCode() == singletonDesignPatternWithEnum2.hashCode()));

		SingletonEnum singletonEnum = SingletonEnum.CONSTRUCT;
		singletonEnum.perform();
		SingletonEnum singletonEnum1 = SingletonEnum.CONSTRUCT;
		singletonEnum1.perform();
		System.out.println(singletonEnum.hashCode() == singletonEnum1.hashCode());
	}

}
