package com.vaddi.java.practice;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DailyPractice {

	public static void main(String[] args) {
		int[] nums = {1,4,6,7,9};
		missingNumbers(nums);
		// Concurrency and MultiThreading
		concurrencyAndMultiThread();
	}

	private static void concurrencyAndMultiThread() {
		
		ExecutorService executor = Executors.newSingleThreadExecutor();
				
		Runnable task1 = () -> {
			System.out.println("Task 1 is running by " + Thread.currentThread().getName());
		};
		
		Runnable task2 = () -> {
			System.out.println("Task 2 is running by " + Thread.currentThread().getName());
		};
		
		executor.submit(task1);
		executor.submit(task2);
		
		
		task1.run();
		task2.run();
	}
	
	public static void missingNumbers(int[] nums) {
				int start = nums[0];
				int len = nums.length;
				int end = nums[len-1];
				
				List<Integer> missing_num = IntStream.rangeClosed(start, end)
						.peek( i -> System.out.println("Checking number ::" + i))
				.filter( i -> Arrays.stream(nums).noneMatch(num -> num == i))
				.boxed()
				.collect(Collectors.toList());
				
				missing_num.forEach(System.out::println);
				
				
				List<Integer> missing_num_new = IntStream.rangeClosed(start, end)
						.peek( i -> System.out.println("Checking number ::" + i))
				.filter( i -> {
					boolean missing = Arrays.stream(nums)
												.peek( num -> System.out.println("Comparing" + i +"with number ::" + num))
												.noneMatch(num -> num == i);
												 System.out.println(i + " is missing: " + missing);
                    return missing;
                })
                .boxed()
                .collect(Collectors.toList());
				
				missing_num_new.forEach(System.out::println);
				
				
				Stream<Character> val = "Raghava".chars().mapToObj(c -> (char)c);
				val.forEach(System.out::println);
				
				List<Object> val1 = "Raghava".chars().mapToObj(c -> (char)c).collect(Collectors.toList());
				System.out.println(val1);
				
				Object val2 = "Raghava".chars().mapToObj(c -> String.valueOf((char)c)).collect(Collectors.joining(" ->"));
				System.out.println(val2);
				
				
				
	}

}
