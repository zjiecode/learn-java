package com.zjiecode.learn.java.proxy.proxy_java;

import com.zjiecode.learn.java.proxy.Fruit;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 调用方法拦截器
 */
public class FruitInvocationHandler implements InvocationHandler {
    private Fruit mFruit;

    public FruitInvocationHandler(Fruit fruit) {
        this.mFruit = fruit;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String result = (String) method.invoke(mFruit, args);
        return "去皮的" + result;
    }
}
