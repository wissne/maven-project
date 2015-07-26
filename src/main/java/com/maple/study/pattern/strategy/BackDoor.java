package com.maple.study.pattern.strategy;

/**
 * maven-project : com.maple.study.pattern.strategy
 * Created by maple on 2015/7/26.
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("找乔国老帮忙, 让吴国太给孙权施加压力");
    }
}
