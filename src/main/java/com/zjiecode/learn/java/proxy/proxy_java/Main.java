package com.zjiecode.learn.java.proxy.proxy_java;

import com.zjiecode.learn.java.proxy.Apple;
import com.zjiecode.learn.java.proxy.Banana;
import com.zjiecode.learn.java.proxy.Fruit;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Fruit proxyApple = (Fruit) Proxy.newProxyInstance(Fruit.class.getClassLoader(), new Class[]{Fruit.class}, new FruitInvocationHandler(apple));
        System.out.println(proxyApple.getClass().getName());
        System.out.println(proxyApple.getName());

        Banana banana = new Banana();
        Fruit proxyBanana = (Fruit) Proxy.newProxyInstance(Fruit.class.getClassLoader(), new Class[]{Fruit.class}, new FruitInvocationHandler(banana));
        System.out.println(proxyApple.getClass().getName());
        System.out.println(proxyBanana.getName());
    }
}
