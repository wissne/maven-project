/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

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
