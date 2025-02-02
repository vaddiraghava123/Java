package com.vaddi.java.streams.practice;


public class Employee {

	private int id;
	private String name;
	private String deptName;
	private double salary;
	public Employee(int id, String name, String deptName, double salary) {
		this.id = id ;
		this.name = name;
		this.deptName = deptName;
		this.salary = salary;
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
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptName=" + deptName + ", salary=" + salary + "]";
	}
	
	
}
