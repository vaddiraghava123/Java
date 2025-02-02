package com.vaddi.java.recordclass;

import java.io.Serializable;

public record StudentRecord(String name,String email)  implements Serializable{
	
	//compact constructor
	public StudentRecord {
		System.out.println("Compact Constructor in record :: "+ name);
		if(name.isEmpty()) {
			throw new IllegalArgumentException("Exception in Record constructor");
		}
		
	}
	private static void testMethod( ) {
		System.out.println("Testing Record method");
	}

}
