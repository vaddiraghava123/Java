package com.vaddi.java.custommarkerandclone;

public class EmployeeList {
	
	private int empNo;
	private String empName;
	private String depName;
	private double salary;
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDepName() {
		return depName;
	}
	public void setDepName(String depName) {
		this.depName = depName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public EmployeeList(int empNo, String empName, String depName, double salary) {
		super();
		this.empNo = empNo;
		this.empName = empName;
		this.depName = depName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "EmployeeList [empNo=" + empNo + ", empName=" + empName + ", depName=" + depName + ", salary=" + salary
				+ "]";
	}

	
}
