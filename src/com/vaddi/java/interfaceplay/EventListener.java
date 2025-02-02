package com.vaddi.java.interfaceplay;

public class EventListener {

	public void registerListener(InterfaceD interfaceD) {
		System.out.println("Event Called ::");
		interfaceD.onCallback();
	}
}
