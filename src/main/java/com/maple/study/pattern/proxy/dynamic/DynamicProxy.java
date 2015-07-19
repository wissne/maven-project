package com.maple.study.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class DynamicProxy<T> {

    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        if (true) {
            (new BeforeAdvice()).exec();
        }

        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
