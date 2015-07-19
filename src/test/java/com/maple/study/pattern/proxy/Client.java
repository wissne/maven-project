package com.maple.study.pattern.proxy;

import org.junit.Test;

import java.util.Date;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class Client {

    @Test
    public void test1() {
        IGamePlayer player = new GamePlayer("张三");
        System.out.println("开始时间：" + new Date());
        player.login("zhangsan", "password");
        player.killBoss();
        player.upgrade();
        System.out.println("结束时间：" + new Date());
    }

    @Test
    public void test2() {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = new GamePlayerProxy(player);
        System.out.println("开始时间：" + new Date());
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间：" + new Date());
    }

    @Test
    public void test3() {
        IGamePlayer proxy = new GamePlayer("张三");
        System.out.println("开始时间：" + new Date());
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间：" + new Date());
    }

    @Test
    public void test4() {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始时间：" + new Date());
        proxy.login("zhangsan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间：" + new Date());
    }
}
