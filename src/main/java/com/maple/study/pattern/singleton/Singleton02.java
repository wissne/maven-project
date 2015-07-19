package com.maple.study.pattern.singleton;

/**
 * 第二种（懒汉，线程安全）：
 * 这种写法能够在多线程中很好的工作，而且看起来它也具备很好的lazy loading，但是，遗憾的是，效率很低，99%情况下不需要同步。
 * Created by aurogon-mac on 15/7/12.
 */
public class Singleton02 {
    private static Singleton02 instance;

    private Singleton02() {}

    public synchronized static Singleton02 getInstance() {
        if (instance == null)
            instance = new Singleton02();
        return instance;
    }
}
