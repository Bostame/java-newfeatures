package com.logicbig.example;

import java.util.concurrent.CompletableFuture;

public class Ex2ExceptionallyAsync {
    public static void main(String[] args) throws Exception {
        CompletableFuture.supplyAsync(() -> {
            printThreadInfo("division task");
            return 10 / 0;
        }).exceptionally(exception -> {
            printThreadInfo("exceptionally Async");
            System.err.println("exception: " + exception);
            return 1;
        }).thenApply(input -> {
            printThreadInfo("multiply task");
            return input * 3;
        }).thenAccept(System.out::println);

        Thread.sleep(2000);
    }

    private static void printThreadInfo(String desc) {
        System.out.printf("%s, Thread: %s%n", desc, Thread.currentThread().getName());
    }
}