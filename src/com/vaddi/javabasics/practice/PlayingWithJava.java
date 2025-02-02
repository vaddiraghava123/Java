package com.vaddi.javabasics.practice;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.vaddi.java.streams.completableFuture.Employee;
import com.vaddi.java.streams.completableFuture.EmployeeList;

public class PlayingWithJava {


    public static void main(String[] args) {
        Map<Employee, String> employeeStringMap = new HashMap<>();

        EmployeeList employeeList = new EmployeeList();
        employeeList.getEmpList();

        Map<List<Employee>, String> employeeListStringMap = new HashMap<>();
        employeeListStringMap.put(employeeList.getEmpList(), "Testing");

        System.out.println("Values are ::" + employeeListStringMap);
    }
}
