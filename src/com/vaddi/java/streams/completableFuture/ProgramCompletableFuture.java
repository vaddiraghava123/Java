package com.vaddi.java.streams.completableFuture;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

/**
 * Achieve Asynchronous programming implements Future, ExecutorService,Callback Interfaces
 * But disadvantages are
 *  1. No proper exception handling
 *  2. Multiple Futures can not combine together
 *  3. Multiple Futures can not linked together
 *  4. Can't be manually completed
 */
public class ProgramCompletableFuture {

    public static void main(String...args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<List<Integer>> future = executorService.submit(
                () -> {
                    delayMethod(10);
                    return Arrays.asList(1, 2, 3);
                });

        List<Integer> integers = future.get();
        integers.stream().forEach(System.out::println);

        CompletableFuture<String> complete = new CompletableFuture();
        complete.get();

        //Here cannot combine / linked multiple futures
        // No proper
    }
    public static void delayMethod(int min){
        try {
            TimeUnit.SECONDS.sleep(min);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
