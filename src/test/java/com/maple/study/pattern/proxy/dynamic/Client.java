/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.proxy.dynamic;

import com.maple.study.pattern.proxy.GamePlayer;
import com.maple.study.pattern.proxy.IGamePlayer;
import org.junit.Test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;
import java.util.Date;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class Client {

    @Test
    public void test1() {
        IGamePlayer player = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayIH(player);
        System.out.println("开始时间：" + new Date());
        ClassLoader classLoader = player.getClass().getClassLoader();
        IGamePlayer proxy = (IGamePlayer) DynamicProxy.newProxyInstance(classLoader, player.getClass().getInterfaces(), handler);
        proxy.getProxy();
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间：" + new Date());
    }

    @Test
    public void test2() {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间：" + new Date());
        IGamePlayer proxy = GamePlayerDynamicProxy.newProxyInstance(player);
        proxy.getProxy();
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间：" + new Date());
    }
}
