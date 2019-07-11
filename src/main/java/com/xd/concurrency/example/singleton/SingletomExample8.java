package com.xd.concurrency.example.singleton;

/**
 * @author LitheLight
 * @date 2019/7/10
 */
public class SingletomExample8 {

    private SingletomExample8() {

    }

    private static class SingletonHolder {
        private static SingletomExample8 instance = new SingletomExample8();
    }

    public static SingletomExample8 getInstance() {
        return SingletonHolder.instance;
    }
}
