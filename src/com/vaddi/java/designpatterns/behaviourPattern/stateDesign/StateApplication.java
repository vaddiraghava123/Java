package com.vaddi.java.designpatterns.behaviourPattern.stateDesign;

public class StateApplication {

	public static void main(String[] args) {

		Context context = new Context();
		
		StartState startState = new StartState();
		startState.doAction(context);
		
		System.out.println(context.getState().toString());
		
		StopState stopState = new StopState();
		stopState.doAction(context);
		
		System.out.println(context.getState().toString());
		
	}

}
