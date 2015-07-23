/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.decorator;

/**
 * maven-project : com.maple.study.pattern.decorator
 * Created by maple on 2015/7/23.
 */
public class FouthGraceSchoolReport extends SchoolReport {
    @Override
    public void report() {
        System.out.println("小三的成绩: 语文62 数学 65 体育98 自然63");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长签名为: " + name);
    }
}
