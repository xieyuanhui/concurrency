package com.xd.concurrency.example.sync;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SynchronizedExample1 {

    /**
     * 修饰一个代码块
     * @param j
     */
    public void test1(int j) {
        synchronized (this) {
            for (int i = 0; i < 10; i++) {
                System.out.format("test1 %d - %d\n", j, i);
            }
        }
    }

    /**
     * 修饰一个方法
     * @param j
     */
    public synchronized void test2(int j) {
        for (int i = 0; i < 10; i++) {
            System.out.format("test2 %d - %d\n", j, i);
        }
    }

    public static void main(String[] args) {
        SynchronizedExample1 example1 = new SynchronizedExample1();
        SynchronizedExample1 example2 = new SynchronizedExample1();
        ExecutorService executorService = Executors.newCachedThreadPool();
        executorService.execute(() -> {
            example1.test2(1);
        });
        executorService.execute(() -> {
            example2.test2(2);
        });
    }
}
