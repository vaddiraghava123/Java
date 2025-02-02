package com.vaddi.java.allmainclasses;

import com.vaddi.java.interfaceplay.EventListener;
import com.vaddi.java.interfaceplay.InterfaceC;
import com.vaddi.java.interfaceplay.MainClass;

public class JavaInterfaceMainClass {

	public static void main(String...strings) {	
		MainClass mainClass = new MainClass();
		mainClass.sayHello();
		
		InterfaceC interfaceC = (a, b) -> a +b;
		System.out.println("Value is :: " +interfaceC.addition(2, 3));
		
		EventListener eventListener = new EventListener();
		eventListener.registerListener( () ->  {
			System.out.println("Callback Invoked");
			int i = 20 ,j =30;
			int k = i + j;
			System.out.println("Callback Invoked :: "+ k);
		});
	}
}