package com.vaddi.javabasics.custommarkerandclone;

public class EmployeeClone implements Cloneable{

	@Override
	public EmployeeClone clone() throws CloneNotSupportedException {
			EmployeeClone employeeClone = (EmployeeClone) super.clone();
			employeeClone.setAddress(address.clone());
			return employeeClone;			
	}

	private String name;
	private String email;
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	Address address;
	
	public EmployeeClone() {
		
	}

	public EmployeeClone(String name, String email, Address address) {
		this.name =name;
		this.email =email;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	@Override
	public String toString() {
		return "EmployeeClone [name=" + name + ", email=" + email + ", address=" + address + "]";
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
