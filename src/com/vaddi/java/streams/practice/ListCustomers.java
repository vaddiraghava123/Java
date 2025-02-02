package com.vaddi.java.streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListCustomers {
	
	public List<Customer> getCustomersData() {
		
		return Stream.of(new Customer(10,"Raghava","r1@yahoo.com", Arrays.asList("9893434334","4343434343"))
				,new Customer(20,"Test","test@yahoo.com", Arrays.asList("43434534","666663434"))
				,new Customer(30,"orrvin","oor@yahoo.com", Arrays.asList("1111111","777777777"))
				,new Customer(40,"thul","thu@yahoo.com", Arrays.asList("653432","2343433"))).collect(Collectors.toList());
	}

}
