/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.prototype;

import com.maple.study.pattern.singleton.prototype.DeepCloneUtil;
import com.maple.study.pattern.singleton.prototype.Wife;
import com.maple.study.pattern.singleton.prototype.DeepHusband;
import com.maple.study.pattern.singleton.prototype.Husband;
import org.junit.Test;

import java.io.IOException;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class Client {

    @Test
    public void test1() {
        Husband husband = new Husband();
        Husband husband1 = new Husband();
        Husband cloneHusband = husband.clone();
    }

    /**
     * 浅克隆测试
     */
    @Test
    public void test2() {
        Husband zhangsan = new Husband("张三", 25);
        Wife xiaomei = new Wife("小美", 23);
        zhangsan.setWife(xiaomei);
        zhangsan.setValue("Zhangsan");
        Husband lisi = zhangsan.clone();
        Wife meimei = lisi.getWife();
        meimei.setName("美美");
        meimei.setAge(28);
        lisi.setWife(meimei);
        lisi.setValue("Lisi");
        lisi.setName("李四");
        lisi.setAge(30);
        System.out.println(zhangsan);
        System.out.println(lisi);
    }

    /**
     * 深克隆方法1
     * 重写每个非基本类型对象的克隆方法
     */
    @Test
    public void test4() {
        Husband zhangsan = new DeepHusband("张三", 25);
        Wife xiaomei = new Wife("小美", 23);
        zhangsan.setWife(xiaomei);
        zhangsan.setValue("Zhangsan");
        Husband lisi = zhangsan.clone();
        Wife meimei = lisi.getWife();
        meimei.setName("美美");
        meimei.setAge(28);
        lisi.setWife(meimei);
        lisi.setValue("Lisi");
        lisi.setName("李四");
        lisi.setAge(30);
        System.out.println(zhangsan);
        System.out.println(lisi);
    }
    /**
     * 深克隆方法2
     * 利用串行化深克隆一个对象，把对象以及它的引用读到流里，在写入其他的对象
     */
    @Test
    public void test5() throws IOException, ClassNotFoundException {
        Husband zhangsan = new Husband("张三", 25);
        Wife xiaomei = new Wife("小美", 23);
        zhangsan.setWife(xiaomei);
        zhangsan.setValue("Zhangsan");
        Husband lisi = zhangsan.deepClone();
        Wife meimei = lisi.getWife();
        meimei.setName("美美");
        meimei.setAge(28);
        lisi.setWife(meimei);
        lisi.setValue("Lisi");
        lisi.setName("李四");
        lisi.setAge(30);
        System.out.println(zhangsan);
        System.out.println(lisi);
    }

    @Test
    public void test6() throws IOException, ClassNotFoundException {
        Husband zhangsan = new Husband("张三", 25);
        Wife xiaomei = new Wife("小美", 23);
        zhangsan.setWife(xiaomei);
        zhangsan.setValue("Zhangsan");
        Husband lisi = (Husband) DeepCloneUtil.clone(zhangsan);
        Wife meimei = lisi.getWife();
        meimei.setName("美美");
        meimei.setAge(28);
        lisi.setWife(meimei);
        lisi.setValue("Lisi");
        lisi.setName("李四");
        lisi.setAge(30);
        System.out.println(zhangsan);
        System.out.println(lisi);
    }
}
