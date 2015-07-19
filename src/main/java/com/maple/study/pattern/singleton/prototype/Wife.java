package com.maple.study.pattern.singleton.prototype;

import java.io.Serializable;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class Wife implements Cloneable, Serializable {

    private String name;

    private int age;

    public Wife(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Wife{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
