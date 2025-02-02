package com.vaddi.java.jdk8;
@FunctionalInterface
public interface TestFunctionalInterface {

	void testingFunctionInterface(String name);
	
	default String displayName(String name1) {
		return name1;
	}
	
	static void dis() {
	}
}
