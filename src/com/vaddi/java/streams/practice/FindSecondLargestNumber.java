package com.vaddi.java.streams.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindSecondLargestNumber {
	
	

	public static void main(String[] args) {

		int[] i = { 23, 232, 531, 1, 43, 535, 534, 1, 2 };
		int a = Arrays.stream(i).distinct().sorted().findFirst()
				.orElseThrow(() -> new IllegalArgumentException("NOT FOUND:"));

		System.out.println("Values ::" + a);

		// common elements in array
		int[] a1 = { 1, 2, 6, 4 };
		int[] a2 = { 4, 5, 6, 7 };

		List<Integer> temp = Arrays.stream(a1).filter(t -> Arrays.stream(a2).anyMatch(s -> s == t)).boxed()
				.collect(Collectors.toList());

		System.out.println("Compare values are ::" + temp);

		// reverse array integers in place

		int[] numbers = { 3, 4, 5, 6, 7, 2, 5 };
		IntStream.range(0, numbers.length / 2).forEach(i1 -> {

			int temp1 = numbers[i1];
			numbers[i1] = numbers[numbers.length - i1 - 1];
			numbers[numbers.length - i1 - 1] = temp1;

		});
		System.out.println("Reverse order are ::" + Arrays.toString(numbers));

	}
}
