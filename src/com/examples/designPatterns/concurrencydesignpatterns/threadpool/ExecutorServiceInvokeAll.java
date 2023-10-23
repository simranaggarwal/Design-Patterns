package com.examples.designPatterns.concurrencydesignpatterns.threadpool;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ExecutorServiceInvokeAll {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        List<Future<String>> futureList = null;
        for (int i = 0; i < 20; i++) {
             futureList = executorService.invokeAll(Arrays.asList(new Callable<String>() {
                 public String call() {
                     System.out.println(Thread.currentThread());
                     return "First";
                 }
             }, new Callable<String>() {

                 public String call() {
                     System.out.println(Thread.currentThread() + " " + Thread.currentThread().getState());
                     return "Second";
                 }
             }));
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(futureList.get(i).get());
        }

        List<Future<String>> futureList2 = null;
        for (int i = 0; i < 20; i++) {
            //Lambda representation of the above
            futureList2 = executorService.invokeAll(Arrays.asList(
                    () -> {
                        System.out.println(Thread.currentThread());
                        return "First";
                        },
                    () -> {
                        System.out.println(Thread.currentThread() + " " + Thread.currentThread().getState());
                        return "Second";
                    }));
        }
        for (int i = 0; i < 2; i++) {
            System.out.println(futureList2.get(i).get());
        }
        executorService.shutdown();
    }
}
