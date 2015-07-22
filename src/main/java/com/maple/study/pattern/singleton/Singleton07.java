/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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
