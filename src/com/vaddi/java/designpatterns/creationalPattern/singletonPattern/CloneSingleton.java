package com.vaddi.java.designpatterns.creationalPattern.singletonPattern;

public class CloneSingleton {

	public static void main(String[] args) {
		SingletonEnum singletonEnum = SingletonEnum.CONSTRUCT;
		// U can not access because protected class
		//singletonEnum.clone();
	}
}
