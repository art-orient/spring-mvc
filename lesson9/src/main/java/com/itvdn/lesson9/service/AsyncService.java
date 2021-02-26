package com.itvdn.lesson9.service;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class AsyncService {
    @Async("threadPoolTaskExecutor")
    public CompletableFuture<Integer> doAsync() {
        System.out.println("Method started");
        try {
            Thread.sleep(10000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Hello World");
        System.out.println("Method ended");
        return CompletableFuture.completedFuture(1);
    }
}
