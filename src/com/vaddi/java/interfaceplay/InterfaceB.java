package com.vaddi.java.interfaceplay;

public interface InterfaceB {
		default void sayHello() {
			System.out.println("Hello from B");
		}
}
