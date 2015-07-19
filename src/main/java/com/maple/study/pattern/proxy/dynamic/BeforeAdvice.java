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
