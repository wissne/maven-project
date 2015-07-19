package com.maple.study.pattern.proxy.dynamic;

import com.maple.study.pattern.proxy.IGamePlayer;

import java.lang.reflect.InvocationHandler;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class GamePlayerDynamicProxy extends DynamicProxy<IGamePlayer> {

    public static IGamePlayer newProxyInstance(IGamePlayer player) {
        ClassLoader loader = player.getClass().getClassLoader();
        Class<?>[] clazz = player.getClass().getInterfaces();
        InvocationHandler handler = new GamePlayIH(player);
        return newProxyInstance(loader, clazz, handler);
    }
}
