/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.proxy.dynamic;

import com.maple.study.pattern.proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class GamePlayerDynamicProxy extends DynamicProxy {

    public static IGamePlayer newProxyInstance(IGamePlayer player) {
        ClassLoader loader = player.getClass().getClassLoader();
        Class<?>[] clazz = player.getClass().getInterfaces();
        InvocationHandler handler = new GamePlayIH(player);
        return (IGamePlayer) newProxyInstance(loader, clazz, handler);
    }
}
