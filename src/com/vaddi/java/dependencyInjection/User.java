package com.vaddi.java.dependencyInjection;

public class User {

	private String firstName;
	private String lastName;
	public User(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	@Override
	public String toString() {
		return "[firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
}
