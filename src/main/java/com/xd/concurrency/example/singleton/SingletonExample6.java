package com.xd.concurrency.example.singleton;

import com.xd.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式，
 * 单例实例在类装载时创建
 */
@ThreadSafe
public class SingletonExample6 {

    private SingletonExample6() {

    }

    private static SingletonExample6 instance = null;

    static {
        instance = new SingletonExample6();
    }

    public static SingletonExample6 getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}
