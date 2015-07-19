package com.maple.study.pattern.singleton;

/**
 * 第三种（饿汉）：
 * 这种方式基于classloder机制避免了多线程的同步问题，不过，instance在类装载时就实例化，虽然导致类装载的原因有很多种，
 * 在单例模式中大多数都是调用getInstance方法， 但是也不能确定有其他的方式（或者其他的静态方法）导致类装载，这时候初始
 * 化instance显然没有达到lazy loading的效果。
 * Created by aurogon-mac on 15/7/12.
 */
public class Singleton03 {

    private static Singleton03 instance = new Singleton03();

    private Singleton03() {
    }

    public static Singleton03 getInstance() {
        return instance;
    }

}