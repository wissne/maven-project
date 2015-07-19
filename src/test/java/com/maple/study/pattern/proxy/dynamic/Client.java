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
        IGamePlayer proxy = DynamicProxy.newProxyInstance(classLoader, player.getClass().getInterfaces(), handler);
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
