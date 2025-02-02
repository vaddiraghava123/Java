package com.vaddi.java.allmainclasses;

import java.util.List;
import java.util.stream.Collectors;

import com.vaddi.java.streams.practice.Customer;
import com.vaddi.java.streams.practice.ListCustomers;

public class MapAndFlatMap {

	public static void main(String[] args) {

		ListCustomers customers = new ListCustomers();
		List<Customer> retrieveList = customers.getCustomersData();
		
		 retrieveList.stream().map(Customer::getEmail).collect(Collectors.toList()).forEach(System.out::println);
		 
		 retrieveList.stream().flatMap(c -> c.getPhoneNo().stream()).collect(Collectors.toList()).forEach(System.out::println);
		
	}

}
