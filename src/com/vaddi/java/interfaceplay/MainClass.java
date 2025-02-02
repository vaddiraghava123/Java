package com.vaddi.java.interfaceplay;

public class MainClass implements InterfaceA, InterfaceB{

	@Override
	public void sayHello() {
		InterfaceA.super.sayHello();
		InterfaceB.super.sayHello();
	}
}
