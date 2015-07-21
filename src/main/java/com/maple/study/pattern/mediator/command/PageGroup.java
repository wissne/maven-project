package com.maple.study.pattern.mediator.command;

/**
 * Created by aurogon-mac on 15/7/20.
 */
public class PageGroup extends Group {
    @Override
    public void find() {
        System.out.println("找到美工组。。。");
    }

    @Override
    public void add() {
        System.out.println("客户要求增加一项页面。。。");
    }

    @Override
    public void delete() {
        System.out.println("客户要求删除一项页面。。。");
    }

    @Override
    public void change() {
        System.out.println("客户要求修改一项页面。。。");
    }

    @Override
    public void plan() {
        System.out.println("客户要求页面变更计划。。。");
    }

    @Override
    public void rollback() {
        System.out.println("客户要求取消页面变更。。。");
    }
}
