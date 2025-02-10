package com.vaddi.java.solidprinciple.isp;
//Interface Segregation Principle (ISP)
//Definition: A class should not be forced to implement interfaces it does not use.
public class InerfaceSeggreationPrinciple {
	
	// Violating ISP: One big interface with unnecessary methods
	interface Worker {
	    void work();
	    void eat();
	}

	class Robot implements Worker {
	    public void work() { /* Working */ }
	    public void eat() { /* Robots don't eat! */ }
	}

	// Correct: Split interface into smaller ones
	interface Workable {
	    void work();
	}

	interface Eatable {
	    void eat();
	}

	class Human implements Workable, Eatable {
	    public void work() { /* Working */ }
	    public void eat() { /* Eating */ }
	}

	class Robot1 implements Workable {
	    public void work() { /* Working */ }
	}


}
