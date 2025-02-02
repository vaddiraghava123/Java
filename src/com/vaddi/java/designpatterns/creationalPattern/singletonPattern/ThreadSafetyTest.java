package com.vaddi.java.designpatterns.creationalPattern.singletonPattern;

public class ThreadSafetyTest {

	public static void main(String[] args) {

		Runnable runnable = () -> {
			SingletonEnum singletonEnum = SingletonEnum.CONSTRUCT;
			singletonEnum.perform();
		};
		
		Thread t = new Thread(runnable, "thread1");
		Thread t2= new Thread(runnable, "thread2");
		Thread t3 = new Thread(runnable, "thread3");
		
		t.start();
		t2.start();
		t3.start();
	}

}
