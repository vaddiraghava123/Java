package com.vaddi.javabasics.interfaceplay;

public class EventListener {

	public void registerListener(InterfaceD interfaceD) {
		System.out.println("Event Called ::");
		interfaceD.onCallback();
	}
}
