package com.vaddi.java.practice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Testjava {

	public static void main(String... args) {
		String str = "Raghavendra Vaddi";
		countString(str);
		overrideHashcode();
		StringPlayWithStream();
		ArrayValuesPlayWithStream();

	}

	private static void ArrayValuesPlayWithStream() {
		int[] i = { 'a', 'b', 'd', 'b', 'c', 'e', 'f', 'b' };

		Map<Character, Long> val = Arrays.stream(i).mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(val);

		// Duplicates
		long duplicate = val.values().stream().filter(c -> c > 1).count();
		System.out.println("Duplicates :: " + duplicate);

		// Remove duplicates
		List<Character> rd = Arrays.stream(i).mapToObj(c -> (char) c).distinct().collect(Collectors.toList());

		System.out.println(rd);
	}

	private static void StringPlayWithStream() {
		String val = "This is Raghavendra Vaddi and done B.Tech";

		Map<Character, Long> countValues = val.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println("Count Values are :: " + countValues);
	}

	private static void overrideHashcode() {
		Person p = new Person(20, "Raghava");
		Person p1 = new Person(20, "Raghava");

		HashSet<Person> setVal = new HashSet<>();
		setVal.add(p1);
		setVal.add(p);

		System.out.println("text :: " + p.equals(p1));
		System.out.println(p == p1);
		System.out.println(setVal.size());
	}

	private static void countString(String str) {
		Map<Character, Long> characterCount = str.chars().mapToObj(c -> (char) c) // Convert each int to char
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		System.out.println(characterCount);
	}

}
