package com.examples.designPatterns.concurrencypatterns.threadpool;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorServiceRunnableWithoutResult {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);

        for (int i = 0; i < 20; i++) {
            Future<?> future = executorService.submit(new Runnable() {
                @Override
                public void run() {
                    System.out.println(Thread.currentThread());
                }
            });

            //Contains null
            System.out.println(future.get());
        }

        for (int i = 0; i < 20; i++) {
            //Lambda representation of the above
            Future<?> future = executorService.submit(() -> System.out.println(Thread.currentThread()));
            //Contains null
            System.out.println(future.get());
        }

        executorService.shutdown();
    }
}
