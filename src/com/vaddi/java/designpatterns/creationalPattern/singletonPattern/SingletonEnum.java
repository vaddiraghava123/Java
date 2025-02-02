package com.vaddi.java.designpatterns.creationalPattern.singletonPattern;

public enum SingletonEnum {

	CONSTRUCT;;
	
	public void perform() {
		System.out.println("doing some task ::: "+ this.hashCode());
	}
}
