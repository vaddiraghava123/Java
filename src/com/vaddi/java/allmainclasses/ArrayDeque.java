package com.vaddi.java.allmainclasses;

import java.io.IOException;
import java.util.stream.Collectors;

public class ArrayDeque {

    public static void main(String[] args)  {
    	
    	java.util.ArrayDeque<String> a = new java.util.ArrayDeque<>();
    	
    	a.push("a");a.push("a1");a.push("Raghava");a.push("a2");a.push("a3");a.push("a4");
    	a.pop();
    	a.pop();
    	
    	a.parallelStream().filter(x -> x.contains("a")).collect(Collectors.toList());
    	
    	System.out.println("List :: "+a);
    }

}
