package com.vaddi.java.allmainclasses;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringsPractise {

	public static void main(String[] args) {
		
		String str = new String("Raghavendra Vaddi");
		
		String str1 = "Raghavendra Vaddi";
		
		String str2 = "Raghavendra";
		
		String str3 ="Vaddi";
		
		str2.concat(str3);
		
		System.out.println("Values ::: "+ str3);

		String  name ="Tests";
		Map<Character, Integer> values = new HashMap<>();
		for(char i : name.toCharArray()) {
			System.out.println("Value "+ i);
			if(values.containsKey(i)) {
				values.put(i, values.get(i)+1);
			} else {
				values.put(i,1);
			}
		}
		for (Map.Entry<Character, Integer> entry : values.entrySet()) {
			System.out.println(entry.getKey() + ": " + entry.getValue());
		}


		Map<Character, Long> charCountMap = name.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		// Displaying count of each character
		System.out.println("Repeated characters in the string:");
		charCountMap.entrySet().stream()
		.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));
		
		testMultiArray();
	}

	private static void testMultiArray() {
		int[][] a = new int[8][8];
		int num =1;
		for(int i =1; i< a.length; i++) {
			for(int j =1 ; j< a[i].length ; j++) {
				a[i][j] = num;
				System.out.print(a[i][j] + " ");
				num ++;
				if(num > 9) {
					num = 1;
				}
			}
			 System.out.println();
		}
		
	}

}
