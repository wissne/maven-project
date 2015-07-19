package com.maple.study.pattern.singleton;

/**
 * 第六种（枚举）：
 * Created by aurogon-mac on 15/7/12.
 */
public enum Singleton06 {
    instance;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String sayHello() {
        return "Hello " + name;
    }
}
