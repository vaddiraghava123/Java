package com.vaddi.java.streams.completableFuture;

import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.Collectors;

public class RunAsyncDemo {

        public static Void filterEmployeeList(List<Employee> empList) throws ExecutionException, InterruptedException {
                CompletableFuture<Void> completableFuture = CompletableFuture.runAsync(new Runnable() {
                                                                                         @Override
                                                                                         public void run() {
                                                                                                 System.out.println("Without Lambda -> ThreadName ::"
                                                                                                 + Thread.currentThread().getName());
                                                                                                 System.out.println(empList.size());
                                                                                         }
                                                                                 }
                );
                return completableFuture.get();
        }

        private static Void filterEmployeeListWithLambda(List<Employee> empList) throws ExecutionException, InterruptedException {

                ExecutorService executorService = Executors.newFixedThreadPool(5);
                CompletableFuture<Void> voidCompletableFuture = CompletableFuture.runAsync(() -> {
                        System.out.println("With Lambda -> ThreadName ::"
                                + Thread.currentThread().getName());
                        System.out.println(empList.size());
                        List<Employee> employeeList = empList.stream().filter(s -> s.getAddress().toString().equals("Unknown")).collect(Collectors.toList());
                        employeeList.stream().forEach(System.out::println);
                        }, executorService);

                return voidCompletableFuture.get();
        }

        public static void main(String...args) throws ExecutionException, InterruptedException {

                EmployeeList employeeList = new EmployeeList();
                filterEmployeeList(employeeList.getEmpList());
                filterEmployeeListWithLambda(employeeList.getEmpList());

        }
}
