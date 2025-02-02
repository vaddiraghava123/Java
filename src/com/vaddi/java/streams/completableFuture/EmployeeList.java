package com.vaddi.java.streams.completableFuture;

import java.util.Arrays;
import java.util.List;

public class EmployeeList{


    public List<Employee> getEmpList() {

        return Arrays.asList(new Employee(1,"Raghava","Unknown",23232L),
                new Employee(2,"Thul","Testss",23232L),
                new Employee(3,"Oorv","Unknown",23232L),
                new Employee(4,"Test","Unknown",23232L),
                new Employee(5,"Bas","Unknown",23232L)
                );
    }

}
