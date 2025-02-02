package com.vaddi.java.designpatterns.creationalPattern.singletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionTest {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SingletonEnum singletonEnum = SingletonEnum.CONSTRUCT;
		
		Constructor<?>[] constructor= SingletonEnum.class.getDeclaredConstructors();
		
		for(Constructor<?> con : constructor) {
			con.setAccessible(true);
			SingletonEnum singletonEnum2= (SingletonEnum) con.newInstance(constructor);
			singletonEnum2.perform();
		}
		
		singletonEnum.perform();
	}
}
