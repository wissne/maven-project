/*
 * Copyright (c) 2015. Lorem ipsum dolor sit amet, consectetur adipiscing elit.
 * Morbi non lorem porttitor neque feugiat blandit. Ut vitae ipsum eget quam lacinia accumsan.
 * Etiam sed turpis ac ipsum condimentum fringilla. Maecenas magna.
 * Proin dapibus sapien vel ante. Aliquam erat volutpat. Pellentesque sagittis ligula eget metus.
 * Vestibulum commodo. Ut rhoncus gravida arcu.
 */

package com.maple.study.pattern.proxy.dynamic;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class BeforeAdvice implements IAdvice {
    @Override
    public void exec() {
        System.out.println("检测到新的代理请求。。。");
    }
}
