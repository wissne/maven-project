/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.builder;

/**
 * Created by aurogon-mac on 15/7/14.
 */
public class BMWModel extends CarModel {
    @Override
    protected void start() {
        System.out.println("宝马车的喇叭声是这个样子的。。。");
    }

    @Override
    protected void stop() {
        System.out.println("宝马车的引擎是这个声音的。。。");
    }

    @Override
    protected void alarm() {
        System.out.println("宝马车跑起来是这个样子的。。。");
    }

    @Override
    protected void engineBoom() {
        System.out.println("宝马车应该这样停车。。。");
    }
}
