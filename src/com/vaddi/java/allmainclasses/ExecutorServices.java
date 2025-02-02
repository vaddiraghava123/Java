package com.vaddi.java.allmainclasses;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServices {

	public static void main(String...args) {
		
		int coreCount = Runtime.getRuntime().availableProcessors();
		ExecutorService executorService = Executors.newFixedThreadPool(coreCount);
		
		for(int i=0;i<10; i++) {
//			Thread t = new Thread(new Task());
//			t.start();
			
			//ExecutorService
			executorService.submit(new Task());
		}
		System.out.println("Thread Name 22 :"
				+ Thread.currentThread().getName() + System.currentTimeMillis());
	}
	
	static class Task implements Runnable {
		@Override
		public void run() {
			System.out.println("Thread Name in Run() :"
					+ Thread.currentThread().getName()+ System.currentTimeMillis());
			
		}
		
	}
}
