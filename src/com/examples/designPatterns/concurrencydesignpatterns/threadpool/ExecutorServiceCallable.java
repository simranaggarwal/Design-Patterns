package com.examples.designPatterns.concurrencydesignpatterns.threadpool;

import java.util.concurrent.*;

public class ExecutorServiceCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 20; i++) {
            Future<String> future = executorService.submit(new Callable<String>(){
                public String call() {
                    return Thread.currentThread().toString();
                }
            });
            System.out.println(future.get());
        }

        for (int i = 0; i < 20; i++) {
            //Lambda representation of the above
            Future<String> future = executorService.submit(() -> Thread.currentThread().toString());
            System.out.println(future.get());
        }

        executorService.shutdown();
    }
}
