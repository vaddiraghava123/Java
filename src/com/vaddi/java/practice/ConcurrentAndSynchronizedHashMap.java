package com.vaddi.java.practice;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentAndSynchronizedHashMap {

		public static void main(String...args) throws InterruptedException {
			
			// SynchornizedHashMap
			
			synchronizedHashmapImplementation();
			
			concurrencyHashmapImplementation();
			 
		}

		private static void concurrencyHashmapImplementation() {
			// use bucket level locking or segment level locking
			
			ConcurrentHashMap<Integer, String> concMap = new ConcurrentHashMap<Integer, String>();
			
			concMap.put(1, "Raghava concMap");
			concMap.put(2, "Raghava1 concMap");
			concMap.put(3, "Raghava2 concMap");
			concMap.put(4, "Raghava3 concMap");
			
			Runnable task = ()-> {
				
				concMap.put(5, "Raghava new");
				System.out.println("Thread added: " + concMap);
			};
			
			Thread t = new Thread(task);
			Thread t1= new Thread(task);
			
			t.start();t1.start();
			System.out.println("Main Thread added: " + concMap);
			
		}

		private static void synchronizedHashmapImplementation() {
			Map<Integer,String>  syncMap = Collections.synchronizedMap(new HashMap());
			
			syncMap.put(1, "Raghava");
			syncMap.put(2, "Raghava1");
			syncMap.put(3, "Raghava2");
			syncMap.put(4, "Raghava3");
			
			
			//Task
			Runnable task =  ()-> {
				synchronized (syncMap) {
					syncMap.put(4, "Raghava4");
					System.out.println("Thread added: " + syncMap);
				}
			};
			
			Thread t = new Thread(task);
			Thread t1 = new Thread(task);
			Thread t2 = new Thread(task);
			
			
			t.start(); t1.start();
			
			 System.out.println("Main thread: " + syncMap);
		}
}
