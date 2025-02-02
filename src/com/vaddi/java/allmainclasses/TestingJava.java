package com.vaddi.java.allmainclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import com.vaddi.java.jdk8.Employees;

public class TestingJava {

	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		list1.add("a");
		list1.add("ab");
		list1.add("ac");
		List<String> list2 = new ArrayList<>();
		list2.add("b");
		list2.add("bc");
		list2.add("bd");

		List<String> mergeList = Stream.concat(list1.stream(), list2.stream()).collect(Collectors.toList());
		mergeList.forEach(System.out::println);

		List<Employees> emps = new ArrayList<>();

		emps.add(new Employees("Raghava", 2));
		emps.add(new Employees("Raghava1", 2));
		emps.add(new Employees("Raghava33", 1));
		emps.add(new Employees("Raghava45", 2));

		Map<Integer, List<Employees>> val = emps.stream()
				.collect(Collectors.groupingBy(Employees::getDepId));

		val.forEach((k,v) -> System.out.println(k+ "-->"+v));

		List<String> listValues = Arrays.asList("Raghava","Vaddi","Oorvin","Thulasi","Vaddi",
				"Oorvin","Thulasi");

		Map<String, Long> result = listValues.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

		result.forEach((k,v) -> System.out.println(k+ "-->"+v));

		//		testingStreamMap();

		int[] arr = {1, 2, 3, 4, 1, 2, 3, 1};
		System.out.println("Number of pairs: " + countPairs(arr)); 
		System.out.println("Sum: " + sumOfNums(arr));
		
		stringJoinerClassImpl();
	}

	private static void stringJoinerClassImpl() {
		StringJoiner stringJoiner1 = new StringJoiner(",");
		stringJoiner1.add("Raghava");
		stringJoiner1.add("Oorvin");
		System.out.println("StringJoiner class :: " + stringJoiner1.toString() + "and length is :: "+ stringJoiner1.length());
	}

	private static int sumOfNums(int[] arr) {
		int sum = IntStream.of(arr).reduce(0,(s,e)-> s+e);

		return sum;
	}

	private static int countPairs(int[] arr) {
		Map<Integer,Integer> val = new HashMap<>();
		for(int num : arr) {
			val.put(num, val.getOrDefault(num, 0)+1);
		}

		int count = 0;
		for (int num : val.keySet()) {
			int count1 = val.get(num);
			count += count1 * (count1 - 1) / 2; // nC2 combination
		}
		return count;
	}

	private static void testingStreamMap() {
		Map<Integer,String> map_value = new HashMap<>();
		map_value.put(10, "apple");
		map_value.put(20, "orange");
		map_value.put(30, "banana");
		map_value.put(40, "watermelon");
		map_value.put(50, "dragonfruit");

		//Sort based on key
		Map<Integer, String>result_map = map_value.entrySet().stream().collect(Collectors.toMap(map -> map.getKey(), null));

		result_map.forEach((k,v) -> System.out.println("Key"+ k + "Value "+ v));
	}

}
