package com.vaddi.java.basics.inheritancePractise;

public interface Flyer {
	default public String identifyMyself() {
		return "I am able to fly.";
	}
}

