package com.vaddi.java.designpatterns.behaviourPattern.stateDesign;

public class StartState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in Start state");
		context.setState(this);
	}
	
	public String toString() {
		return "START STATE";
	}
	
}
