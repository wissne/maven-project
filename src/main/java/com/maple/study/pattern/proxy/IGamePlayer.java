package com.maple.study.pattern.proxy;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public interface IGamePlayer {

    void login(String user, String pwd);

    void killBoss();

    void upgrade();

    IGamePlayer getProxy();
}
