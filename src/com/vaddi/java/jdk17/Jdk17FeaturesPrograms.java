package com.vaddi.java.jdk17;

import java.util.SplittableRandom;

public class Jdk17FeaturesPrograms {

    

    public static void main(String[] args) {
        //Switch Statement
        beforeJdk12Switch();
        System.out.println(afterJdk12Switch());

        //Pattern matching
        Object obj = new String();
        objectInstanceOf(obj);


        //Sealed Class and Interfaces
        MySealedClass mySealedClass = new A();
        System.out.println("Sealed class :: "+ mySealedClass.getMessage());

        MySealedClass mySealedClass1 = new B();
        System.out.println("Sealed class :: "+ mySealedClass1.getMessage());

        //Splittable Random numbers
        SplittableRandom splittableRandom = new SplittableRandom();
        for(int k =0;k<10;k++) {
            int i = splittableRandom.nextInt(k,10);
            System.out.println("Random number is ::" + i);
        }

        double a = 0.1;
        double b = 0.2;
        double c = a + b;
        System.out.println(c);

    }

    private static void objectInstanceOf(Object obj) {
        if(obj instanceof String) {
            String str = (String) obj;
            System.out.println("Object  :: "+str);
        }

        //after Jdk17
        if(obj instanceof String str){
            System.out.println("Object in Jdk17 :: "+ str);
        }

    }


    private static String afterJdk12Switch() {
        //Allow String and int
        int i =3;
        return switch(i) {
            case 1 -> "January";
            case 3 -> "March";
            default -> "No month";
        };
    }

    private static void beforeJdk12Switch() {
        //Allows String
        String i ="20";
        switch (i) {
            case "10":
                System.out.println("Value is :: "+ i);
                break;
            case "20":
                System.out.println("Value is :: "+ i);
                break;
            default:
                System.out.println("Default Value is :: "+ i);
                break;
        }
    }
}
