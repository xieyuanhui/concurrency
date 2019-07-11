package com.xd.concurrency.example.singleton;

import com.xd.concurrency.annoations.NotThreadSafe;
import com.xd.concurrency.annoations.ThreadSafe;

/**
 * 饿汉模式，
 * 单例实例在类装载时创建，处理多的时候加载慢
 */
@ThreadSafe
public class SingletonExample2 {

    private SingletonExample2() {

    }

    private static SingletonExample2 instance = new SingletonExample2();

    public static SingletonExample2 getInstance() {
        return instance;
    }
}
