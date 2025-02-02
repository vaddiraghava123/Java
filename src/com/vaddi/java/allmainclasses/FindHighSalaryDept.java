package com.vaddi.java.allmainclasses;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.vaddi.java.streams.practice.Employee;

public class FindHighSalaryDept {

	public static void main(String...args) {
		
		List<Employee> empList = Arrays.asList(new Employee(1,"Raghava","cse",233.99),
				new Employee(2,"Raghu","cse",2333.99)
				,new Employee(3,"Test","IT",5333.99)
				,new Employee(4,"OO","IT",2233.99)
				,new Employee(5,"Suj","Civil",1233.99)
				,new Employee(6,"Na","Civil",6233.99));
		
		 Comparator<Employee> sortSal= Comparator.comparing(Employee::getSalary);
		 
		 Comparator<Employee> sortSal1= Comparator.comparingDouble(Employee::getSalary);
		
		Map<String, Optional<Employee>> maxSalary = empList.stream()
		.collect(Collectors.groupingBy(Employee::getDeptName,
				Collectors.reducing(BinaryOperator.maxBy(sortSal))));
		
		maxSalary.entrySet().stream().forEach(System.out::println);
		
		Map<String, Employee> maxSalary1 = empList.stream()
				.collect(Collectors.groupingBy(Employee::getDeptName,
						Collectors.collectingAndThen(
								Collectors.maxBy(Comparator.comparingDouble(e-> e.getSalary())), Optional::get)));
				System.out.println("------------------");
				maxSalary1.entrySet().stream().forEach(System.out::println);
				
		//Sum of lists using reduce and sum
		List<Integer> values = Arrays.asList(1,3,4,5);
		
		int sumValue = values.stream().mapToInt(v -> v).sum();
		
		int sumValue1 = values.stream().reduce(0,(a,b)->a+b);
		
		double sumValue11 = empList.stream().mapToDouble(Employee::getSalary).reduce(0, (a,b) -> a>b?a:b);
		double sumValue12 = empList.stream().mapToDouble(Employee::getSalary).sum();
		System.out.println("Sum :: "+ sumValue +"," +sumValue1);
		
		System.out.println("Sum1 :: "+ sumValue11 +"," +sumValue12);
		
		//Concatenate String 
		
		Stream<String> strValues = Stream.of("Raghava","Vaddi","Adding");
		
		String result = strValues.reduce("a", (a,b) -> a + ","+b);
		System.out.println("result "+ result);
		
	}
}
