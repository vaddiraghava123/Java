package com.vaddi.java.designpatterns.behaviourPattern.stateDesign;

public class StopState implements State {

	public void doAction(Context context) {
		System.out.println("Player is in Stop state");
		context.setState(this);
	}
	
	public String toString() {
		return "STOP STATE";
	}
	
}
