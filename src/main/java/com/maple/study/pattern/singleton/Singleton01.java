/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.singleton;

/**
 * 第一种（懒汉，线程不安全）：
 * 这种写法lazy loading很明显，但是致命的是在多线程不能正常工作。
 * Created by aurogon-mac on 15/7/12.
 */
public class Singleton01 {
    private static Singleton01 instance;

    private Singleton01() {}

    public Singleton01 getInstance() {
        if (instance == null)
            instance = new Singleton01();
        return instance;
    }
}
