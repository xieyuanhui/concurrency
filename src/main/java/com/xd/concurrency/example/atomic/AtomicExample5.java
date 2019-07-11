package com.xd.concurrency.example.atomic;

import lombok.Getter;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

public class AtomicExample5 {

    //更新某一个类的变量
    private static AtomicIntegerFieldUpdater<AtomicExample5> updater = AtomicIntegerFieldUpdater.newUpdater(AtomicExample5.class, "count");

    @Getter
    public volatile int count = 100;

    private static AtomicExample5 example5 = new AtomicExample5();

    public static void main(String[] args) {
        if (updater.compareAndSet(example5, 100, 120)) {
            System.out.println("success");
        }

        if (updater.compareAndSet(example5, 100, 120)) {
            System.out.println("success");
        } else {
            System.out.println("failed");
        }
    }
}
