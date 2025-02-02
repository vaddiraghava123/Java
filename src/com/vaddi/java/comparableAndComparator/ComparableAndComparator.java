package com.vaddi.java.comparableAndComparator;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ComparableAndComparator {
    public static void main(String[] args) {

    //Comparable - natural Order
        List<Person> people = Arrays.asList(
                new Person("Alice", 30),
                new Person("Ref", 25),
                new Person("Charlie", 35)
        );

        List<Person1> people1 = Arrays.asList(
                new Person1("Alice", 30),
                new Person1("Bob", 25),
                new Person1("Charlie", 35),
                new Person1("Alice", 25),
                new Person1("Charlie", 30)
        );
        // Sort using natural ordering (Comparable)
        List<Person> sortedPeople = people.stream()
                .sorted()  // No Comparator needed; uses Comparable
                .collect(Collectors.toList());

        System.out.println("Sorted by age using Comparable:");
        sortedPeople.forEach(System.out::println);

        //Multiple sort -name and age
        List<Person1> sortedPeople1 = people1.stream().sorted(Comparator.comparing(Person1::getName)
                .thenComparing(Person1::getAge)).collect(Collectors.toList());;
        System.out.println("Sorted by name, then by age: 1 ");
        sortedPeople1.forEach(System.out::println);

    }
}


