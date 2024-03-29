package com.xd.concurrency.example.singleton;

import com.xd.concurrency.annoations.NotThreadSafe;

/**
 * 懒汉模式，
 * 单例实例在第一次使用时创建
 */
@NotThreadSafe
public class SingletonExample1 {

    /**
     * 私有构造函数
     */
    private SingletonExample1() {

    }

    /**
     * 单例对象
     */
    private static SingletonExample1 instance = null;

    /**
     * 静态的工厂方法
     * @return
     */
    public static SingletonExample1 getInstance() {
        if (instance == null) {
            instance = new SingletonExample1();
        }
        return instance;
    }
}
