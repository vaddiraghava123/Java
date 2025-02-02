package com.vaddi.java.allmainclasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

import com.vaddi.java.custommarkerandclone.EmployeeList;

public class HighestSalaryByDept {

	public static void main(String[] args) {

		List<EmployeeList> asList = Arrays.asList(new EmployeeList(101,"Raghava","civil",234.90),
				new EmployeeList(102,"Test","civil",2341.90),
				new EmployeeList(103,"Su","IT",23433.90),
				new EmployeeList(104,"HDF","IT",23564.90),
				new EmployeeList(105,"BA","mec",23234.90),
				new EmployeeList(106,"TA","civil",234.90),
				new EmployeeList(107,"GA","mec",23443.90));
		
		Comparator<EmployeeList> comparing = Comparator.comparing(EmployeeList::getSalary);
		
		Map<String, Optional<EmployeeList>> values =asList.stream()
		.collect(Collectors.groupingBy(EmployeeList::getDepName,
				 Collectors.reducing(BinaryOperator.maxBy(comparing))
				));
		
		System.out.println("Max Salaries are :: "+ values);
		
		
	}
	
	
}
