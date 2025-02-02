package com.vaddi.java.streams.completableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SupplyAsyncDemo {

    public static List<Employee> getEmployeeList() throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(5);
        CompletableFuture<List<Employee>> completableFuture = CompletableFuture.supplyAsync( () -> {
            EmployeeList employeeList = new EmployeeList();
            return employeeList.getEmpList();
        });
        return completableFuture.get();
    }

    public static void main(String...args) throws ExecutionException, InterruptedException {
        SupplyAsyncDemo supplyAsyncDemo = new SupplyAsyncDemo();
        supplyAsyncDemo.getEmployeeList().stream().forEach(System.out::println);
    }
}
