package com.vaddi.java.streams.completableFuture;

import java.util.Objects;

public class Employee implements Comparable<Employee>{
    @Override
    public int compareTo(Employee o) {
        return this.address.compareTo(String.valueOf(o.getAddress()));
    }

    private int id;
    private String name;
    private String address;
    private Long phoneNo;
   
    @Override
    public boolean equals(Object o) {
        System.out.println(" Calling Equals method");
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        System.out.println(" Calling Equals method -- end");
        return getId() == employee.getId() && Objects.equals(getName(), employee.getName()) && Objects.equals(getAddress(), employee.getAddress()) && Objects.equals(getPhoneNo(), employee.getPhoneNo());
    }

    @Override
    public int hashCode() {
        System.out.println(" Calling hashCode method");
        return 0;
    }

    public Employee(int id, String name, String address, Long phoneNo) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNo=" + phoneNo +
                '}';
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(Long phoneNo) {
        this.phoneNo = phoneNo;
    }


}
