package com.xd.concurrency.example.singleton;

import com.xd.concurrency.annoations.NotRecommend;
import com.xd.concurrency.annoations.NotThreadSafe;
import com.xd.concurrency.annoations.ThreadSafe;

/**
 * 懒汉模式->双重同步锁单例模式
 * 单例实例在第一次使用时创建
 */
@NotThreadSafe
@NotRecommend
public class SingletonExample4 {

    private SingletonExample4() {

    }

    /**
     * 1、 memory = allocate() 分配对象的内存空间
     * 2、ctorInstance() 初始化对象
     * 3、instance = memoory 设置instance指向刚分配的内存
     *
     * JVM + cpu优化，发生了指令重排
     */

    private static SingletonExample4 instance = null;

    public static SingletonExample4 getInstance() {
        //双重检测机制
        if (instance == null) {
            //同步锁
            synchronized (SingletonExample4.class) {
                if (instance == null) {
                    instance = new SingletonExample4();
                }
            }
        }
        return instance;
    }
}
