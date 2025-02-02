package com.vaddi.java.designpatterns.behaviourlPattern.ObserverPattern;

import java.util.concurrent.CompletableFuture;

/**
 * Used in Threads - One to One dependency
 * When one object changed the state then the other objects also reflected 
 * 
 * Observer Pattern also known as Dependents 
 *  OR
 *  Publish-Subscribe
 *  
 *  
 *  Observer & Observable - are deprecated after Java 9
 *  Alternative used -  
 *  
 *  1. CompletableFuture - runAsync and supplyAsync - run asynchronously
 *  
 *  advanced features for handling asynchronous data streams and event-based programming. 
 *  2. Reactive Programming libraries Project Reactor 'Flux' and RxJava
 *  3. 
		Java 9 + Flow API
 */
public class ImplementObserverPattern {

	public static void main(String[] args) {

		CompletableFuture.supplyAsync(() ->"Hello")
					.thenApply(result -> result + "World :: Raghava").thenAccept(System.out::println);
	}

}
