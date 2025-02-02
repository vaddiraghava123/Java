package com.vaddi.java.jdk8;

public class Employees {
	private String name;
	private int depId;
	
	@Override
	public String toString() {
		return "Employees [name=" + name + ", depId=" + depId + "]";
	}
	public Employees(String name, int depId) {
		this.name= name;
		this.depId = depId;
	}
	public String getName() {
		return name;
	}
	public  void setName(String name) {
		this.name = name;
	}
	public int getDepId() {
		return depId;
	}
	public  void setDepId(int depId) {
		this.depId = depId;
	}
	
	
}



