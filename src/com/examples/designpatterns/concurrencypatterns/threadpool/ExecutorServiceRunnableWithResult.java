package com.examples.designpatterns.concurrencypatterns.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceRunnableWithResult {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 20; i++) {
            Future<String> future = executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println("Running " + Thread.currentThread());
                }
            }, "Ran " + i);
            System.out.println(future.get());
        }

        for (int i = 0; i < 20; i++) {
            //Lambda representation of the above
            Future<String> future = executorService.submit(() -> System.out.println("Running " + Thread.currentThread()), "Ran " + i);
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}
