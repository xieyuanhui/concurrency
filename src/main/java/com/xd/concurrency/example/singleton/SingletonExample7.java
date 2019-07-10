package com.xd.concurrency.example.singleton;

import com.xd.concurrency.annoations.Recommend;
import com.xd.concurrency.annoations.ThreadSafe;

/**
 * 枚举模式：最安全的
 */
@ThreadSafe
@Recommend
public class SingletonExample7 {

    private SingletonExample7() {

    }

    public static SingletonExample7 getInstance() {
        return Singleton.INSTANCE.getInstance();
    }

    private enum Singleton {
        INSTANCE;

        private SingletonExample7 singletonExample7;

        // JVM保证这个给方法绝对只调用一次
        Singleton() {
            singletonExample7 = new SingletonExample7();
        }

        public SingletonExample7 getInstance() {
            return singletonExample7;
        }
    }

    public static void main(String[] args) {
        System.out.println(getInstance().hashCode());
        System.out.println(getInstance().hashCode());
    }
}
