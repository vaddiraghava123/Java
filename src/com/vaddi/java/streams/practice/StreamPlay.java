package com.vaddi.java.streams.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamPlay {

    public static void main(String[] args) {
        convertMapToStream();
        
        streamsPlay();
    }

    private static void streamsPlay() {
    	 Map<String,Integer> m1 = Map.of("A",1,"B",2,"C",3);
         Map<String,Integer> m2 = Map.of("A",1,"D",4,"F",5);
         Map<String,Integer> m3 = Map.of("A",1,"B",2,"i",6);
         Map<String,Integer> m4 = Map.of("A",1,"E",3,"C",7);

         List<Map<String,Integer>> mapList = Arrays.asList(m1,m2,m3,m4);

         Set<Set<String>> keyValuesList = mapList.stream()
                 .map(Map::keySet)
                 .collect(Collectors.toSet());

         System.out.println("Values are :: "+ keyValuesList);

         Set<String> keyValuesList1 = mapList.stream()
                 .map(Map::keySet)
                 .flatMap(Set::stream)
                 .collect(Collectors.toSet());

         System.out.println("Values are :: "+ keyValuesList1);

         Set<String> keyValuesList2 = mapList.stream()
                 .map(Map::keySet)
                 .flatMap(Set::stream)
                 .collect(Collectors.toSet())
                         .stream()
                                 .filter(m -> mapList.stream().allMatch(map -> map.containsKey(m)))
                                         .collect(Collectors.toSet());

         System.out.println("Values are 2 :: "+ keyValuesList2);

         Map<String, List<Integer>> valuesMap = keyValuesList1.stream()
                 .collect(Collectors.toMap(
                         key -> key,
                         key -> mapList.stream()
                                 .map(map -> map.get(key))
                                 .collect(Collectors.toList())
                 ));
         System.out.println("Values are :: "+ valuesMap);
         // Output the results
         valuesMap.forEach((key, values) -> {
             boolean allEqual = values.stream().distinct().count() == 1;
             System.out.println("Key: " + key + ", Values: " + values + ", All equal: " + allEqual);
         });
		
	}

	private static void convertMapToStream() {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Raghava");
        map.put(2, "Oorvin");
        map.put(3, "Thulasi");

        System.out.println("Map is ::" + map);
        Stream<Map.Entry<Integer, String>> stream = map.entrySet().stream();
        System.out.println("Convert Map - entrySet (entire Map values) to Stream :: "+ Arrays.toString(stream.toArray()));

        //Only keys and Values will display
        Stream<Integer> stream1 = map.keySet().stream();
        Stream<String> stream2 = map.values().stream();
        System.out.println("Retrieve keys :: " + Arrays.toString(stream1.toArray()) +" and values only" + Arrays.toString(stream2.toArray()));

        //Stream first element

        Stream<String> streamVal
                = Stream.of("Geek_First", "Geek_2",
                "Geek_3", "Geek_4",
                "Geek_Last");

        Optional i = streamVal.reduce((a, b) -> a);
        System.out.println("First value in stream :: "+ i.get().toString());
    }
}
