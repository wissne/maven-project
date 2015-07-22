/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.singleton;

import org.junit.Test;

/**
 * Created by aurogon-mac on 15/7/12.
 */
public class SingletonTest {

    @Test
    public void test06() {
        Singleton06 instance1 = Singleton06.instance;
        instance1.setName("maple");
        Singleton06 instance2 = Singleton06.instance;
        instance2.setName("aurogon");

        System.out.println(instance1.sayHello());
        System.out.println(instance2.sayHello());
    }
}
