package com.xd.concurrency.example.singleton;

import com.xd.concurrency.annoations.NotRecommend;
import com.xd.concurrency.annoations.ThreadSafe;

/**
 * 懒汉模式->双重同步锁单例模式
 * 单例实例在第一次使用时创建
 */
@ThreadSafe
@NotRecommend
public class SingletonExample5 {

    private SingletonExample5() {

    }

    /**
     * 1、 memory = allocate() 分配对象的内存空间
     * 2、ctorInstance() 初始化对象
     * 3、instance = memoory 设置instance指向刚分配的内存
     */

    /**
     * volatile + 双重检测机制 -> 禁止指令重排
     */
    private volatile static SingletonExample5 instance = null;

    public static SingletonExample5 getInstance() {
        //双重检测机制
        if (instance == null) {
            //同步锁
            synchronized (SingletonExample5.class) {
                if (instance == null) {
                    instance = new SingletonExample5();
                }
            }
        }
        return instance;
    }
}
