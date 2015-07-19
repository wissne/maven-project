package com.maple.study.pattern.proxy;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class GamePlayerProxy implements IGamePlayer, IProxy {

    private IGamePlayer gamePlayer = null;

    public GamePlayerProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    public GamePlayerProxy(String name) {
        try {
            gamePlayer = new GamePlayer(this, name);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void login(String user, String pwd) {
        this.gamePlayer.login(user, pwd);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
        this.count();
    }

    @Override
    public IGamePlayer getProxy() {
        return this;
    }

    @Override
    public void count() {
        System.out.println("升级总费用是：150元");
    }
}
