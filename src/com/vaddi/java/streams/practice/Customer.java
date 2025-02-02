package com.vaddi.java.streams.practice;

import java.util.List;

public class Customer {

	private int id;
	private String name;
	private String email;
	private List<String> phoneNo;
	public Customer(int i, String string, String string2, List<String> asList) {
		this.id = i;
		this.name = string;
		this.email = string2;
		this.phoneNo = asList;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<String> getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(List<String> phoneNo) {
		this.phoneNo = phoneNo;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", email=" + email + ", phoneNo=" + phoneNo + "]";
	}
	
	
}
