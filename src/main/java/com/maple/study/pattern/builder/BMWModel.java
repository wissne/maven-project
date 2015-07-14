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
