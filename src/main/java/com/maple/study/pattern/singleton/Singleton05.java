package com.maple.study.pattern.singleton;

/**
 * 第五种（静态内部类）：
 *
 * Created by aurogon-mac on 15/7/12.
 */
public class Singleton05 {
    private static class SingletonHolder {
        private static final Singleton05 INSTANCE = new Singleton05();
    }

    private Singleton05() {}

    public static Singleton05 getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
