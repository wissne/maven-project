package com.maple.study.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by aurogon-mac on 15/7/18.
 */
public class GamePlayIH implements InvocationHandler {

    private Class<?> clazz = null;

    private Object object = null;

    public GamePlayIH(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(object, args);
    }
}
