package com.maple.study.pattern.strategy;

import org.junit.Test;

/**
 * maven-project : com.maple.study.pattern.strategy
 * Created by maple on 2015/7/26.
 */
public class ZhaoYun {

    @Test
    public void test() {
        Context context;
        System.out.println("---刚刚到吴国的时候拆第一个---");
        context = new Context(new BackDoor());
        context.operate();
        System.out.println("---刘备乐不思蜀了,拆第二个---");
        context = new Context(new GivenGreenLight());
        context.operate();
        System.out.println("---孙权的小兵追了,咋办? 拆第三个---");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
