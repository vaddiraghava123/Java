package com.vaddi.java.allmainclasses;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.vaddi.java.streams.practice.Person;
import com.vaddi.java.streams.practice.User;

public class ReduceExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(new Person("John", 30, "Hyderabad"),
                new Person("Alice", 25, "Bangalore"),
                new Person("Alice", 25, "Bangalore"),
                new Person("Alice", 25, "Bangalore"),
                new Person("Alice", 25, "Bangalore"),
                new Person("Bob", 40, "Chennai"));

		//Sum of age using reduce
        int totalAge = people.stream().mapToInt(Person::getAge).reduce(0, Integer::sum);
        System.out.println("Total Age using reduce: " + totalAge);
        
        //Sum of age using sum
        int totalAge1 = people.stream().mapToInt(Person::getAge).sum();
        System.out.println("Total Age: using sum: " + totalAge);
        
        //CountByCity
        Map<String, Long> countByCity = people.stream()
        		.collect(HashMap::new, 
        				(map, person) -> map.put(person.getCity(), 
        								 Long.valueOf(totalAge1)), HashMap::putAll);

        System.out.println("Total countByCity: " + countByCity);
        
        //CountByName
        Collections.reverse(people);
        
        System.out.println("Reverse values are :: " + people);
        //Using Descending Iterator - display the list in reverse
        ArrayDeque<Person> ad = new ArrayDeque<>();
        ad.add(new Person("Alice", 25, "Bangalore"));
        ad.add(  new Person("Alice", 25, "Bangalore"));
        ad.add( new Person("Alice", 25, "Bangalore"));
        ad.add(   new Person("Alice", 25, "Bangalore"));
        ad.add(     new Person("Bobqq", 40, "Chennai"));
        
        Iterator i = ad.descendingIterator();
        i.forEachRemaining((o)-> {
        	System.out.println(o.toString());
        });
        
        List<String> values = Arrays.asList("apple","banana","sweets","banana","apple","apple");
        
        Map<String,Long> commonValues =values.stream()
        	  .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        
        System.out.println("Values are :: "+ commonValues);
        Map<String, Long> finalMap = new LinkedHashMap<>();
        commonValues.entrySet().stream()
        		.sorted(Map.Entry.<String, Long>comparingByKey()
                        ).forEachOrdered(e -> finalMap.put(e.getKey(), e.getValue()));
        System.out.println(finalMap);
        
        List<String> list = Arrays.asList("a", "bb", "ccc");
        List<String> sameList = list.stream()
                                    .map(Function.identity())
                                    .collect(Collectors.toList());
        System.out.println(sameList);
        
        List<User> users = Arrays.asList(new User("1","Rag"),new User("2", "Bob"),new User("3", "Charlie"));

	        Map<String, User> userMap = users.stream()
	                                         .collect(Collectors.toMap(User::getId, Function.identity()));

	        userMap.forEach((id, user) -> System.out.println(id + ": " + user));
        
	}
}
