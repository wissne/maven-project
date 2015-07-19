package com.maple.study.pattern.singleton;

/**
 * 第七种（双重校验锁）：
 * Created by aurogon-mac on 15/7/12.
 */
public class Singleton07 {
    private static volatile Singleton07 instance;

    private Singleton07() {}

    public Singleton07 getInstance() {
        if (instance == null) {
            synchronized (Singleton07.class) {
                if (instance == null) {
                    instance = new Singleton07();
                }
            }
        }
        return instance;
    }
}
