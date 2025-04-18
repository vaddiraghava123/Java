package com.vaddi.java.designpatterns.behaviourPattern.stateDesign;

public class Context {
	
	private State state;
	
	public Context() {
		state = null;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
