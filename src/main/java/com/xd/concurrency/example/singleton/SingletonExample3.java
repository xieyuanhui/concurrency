package com.xd.concurrency.example.singleton;

import com.xd.concurrency.annoations.NotRecommend;
import com.xd.concurrency.annoations.ThreadSafe;

/**
 * 懒汉模式，
 * 单例实例在第一次使用时创建
 */
@ThreadSafe
@NotRecommend
public class SingletonExample3 {

    private SingletonExample3() {

    }

    private static SingletonExample3 instance = null;

    public static synchronized SingletonExample3 getInstance() {
        if (instance == null) {
            instance = new SingletonExample3();
        }
        return instance;
    }
}
