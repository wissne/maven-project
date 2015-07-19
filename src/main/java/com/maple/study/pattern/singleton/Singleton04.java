package com.maple.study.pattern.singleton;

/**
 * 第四种（饿汉，变种）：
 * 表面上看起来差别挺大，其实更第三种方式差不多，都是在类初始化即实例化instance。
 * Created by aurogon-mac on 15/7/12.
 */
public class Singleton04 {

    private static Singleton04 instance = null;

    static {
        instance = new Singleton04();
    }

    private Singleton04() {}

    public Singleton04 getInstance() {
        return instance;
    }
}
