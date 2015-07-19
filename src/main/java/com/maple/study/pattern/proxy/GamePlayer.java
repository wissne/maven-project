package com.maple.study.pattern.proxy;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class GamePlayer implements IGamePlayer {

    private String name = "";

    private IGamePlayer proxy = null;

    public GamePlayer(String name) {
        this.name = name;
    }

    public GamePlayer(IGamePlayer player, String name) throws Exception {
        if (player == null)
            throw new Exception("不能创建真实角色！");
        this.name = name;
    }

    @Override
    public void login(String user, String pwd) {
        if (this.isProxy())
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        else
            System.out.println("请使用代理访问");
    }

    @Override
    public void killBoss() {
        if (this.isProxy())
            System.out.println(this.name + "在打怪！");
        else
            System.out.println("请使用代理访问");
    }

    private boolean isProxy() {
        return proxy != null;
    }

    @Override
    public void upgrade() {
        if (this.isProxy())
            System.out.println(this.name + "又升了一级！");
        else
            System.out.println("请使用代理访问");
    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayerProxy(this);
        return this.proxy;
    }
}
