package com.vaddi.java.solidprinciple.srp;

public class Employee_NotFollowSingleresponsble {
	// Violating SRP: This class handles both employee data and file saving
	    private String name;
	    
	    public void saveToFile() {
	        // Code to save employee data to a file
	}
}
