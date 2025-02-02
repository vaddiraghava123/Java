package com.vaddi.java.allmainclasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class BasicCodeJava {

	public static void main(String...args) {
		//Fibonoci Series
		//Palindrome or not
		primeNumber();
		fibonacci();
		anagramWords();
	}

	private static void anagramWords() {
		Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the reference string:");
        String referenceString = scanner.nextLine().trim();

        System.out.println("Enter words (type 'exit' to finish):");
        List<String> words = new ArrayList<>();
        while (true) {
            String word = scanner.nextLine().trim();
            if (word.equalsIgnoreCase("exit")) {
                break;
            }
            words.add(word);
        }

        List<String> anagrams = findAnagrams(referenceString, words);

        System.out.println("Anagrams of \"" + referenceString + "\" are: " + anagrams);
	}

	public static List<String> findAnagrams(String reference, List<String> words) {
        // Clean up the reference string
        String sortedReference = reference.replaceAll("[^a-zA-Z]", "").toLowerCase()
                                          .chars()
                                          .sorted()
                                          .mapToObj(c -> String.valueOf((char) c))
                                          .collect(Collectors.joining());

        return words.stream()
                    .filter(word -> {
                        String sortedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase()
                                                .chars()
                                                .sorted()
                                                .mapToObj(c -> String.valueOf((char) c))
                                                .collect(Collectors.joining());
                        return sortedReference.equals(sortedWord);
                    })
                    .collect(Collectors.toList());
    }

	private static void fibonacci() {
		int start = 1;
		int end = 20;
		List<Integer> fibonacciInRange = generateFibonacci()
				.dropWhile(n -> n < start)
				.takeWhile(n -> n <= end)
				.collect(Collectors.toList());

		System.out.println("Fibonacci numbers between " + start + " and " + end + ": " + fibonacciInRange);
	}

	public static Stream<Integer> generateFibonacci() {
		return Stream.iterate(new int[]{0, 1}, t -> new int[]{t[1], t[0] + t[1]})
				.map(t -> t[0]);
	}

	static void primeNumber() {
		List<Integer> primeValues = IntStream.range(1, 30)
				.filter(BasicCodeJava::isPrime)
				.boxed().collect(Collectors.toList());

		System.out.println("Prime Values are :: "+ primeValues);
	}


	private static boolean isPrime(int num) {
		if (num <= 1) {
			return false;
		}
		return IntStream.rangeClosed(2, (int) Math.sqrt(num))
				.allMatch(n -> num % n != 0);
	}
}
