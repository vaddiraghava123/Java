package com.vaddi.java.streams.functionInterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class MyFunctionalClass {

    public static void printMessage(){
        System.out.println("Welcome Functional Interface using method Reference");
    }
    public static void main(String...args) {
        //Lamda
        MyFunctionaIInterface myFunctionaIInterface = () -> {System.out.println("Welcome Functional Interface using Lambda");
        };
        myFunctionaIInterface.getMessage();

        //MethodReference
        MyFunctionaIInterface myFunctionaIInterface1 = MyFunctionalClass::printMessage;
        myFunctionaIInterface1.getMessage();

        //Predicate - Verify true or false
        Predicate<String> isVerify = s -> s.length() > 4;
        System.out.println("Predicate  :: "+ isVerify.test("Raghava"));

        //Function - Input and Output
        Function<String,Integer> function = s -> s.length();
        System.out.println("Function  :: "+ function.apply("Vaddi"));

        //Consumer - Input only and no output
        Consumer<String> consumer = s -> s.toString();
        consumer.accept("Raghava");

        Consumer consumer1 = System.out::println;
        consumer1.accept("Hello");

        //Supplier - Output only
        Supplier<String> supplier = () -> "Raghava";
        System.out.println(supplier.get());

    }
}
