package com.zjiecode.learn.java.proxy.cglib;

import com.zjiecode.learn.java.proxy.Apple;
import net.sf.cglib.proxy.Enhancer;

public class Main {
    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(Apple.class);
        enhancer.setCallback(new FruitMethodInterceptor());
        Apple apple = (Apple) enhancer.create();
        System.out.println(apple.getClass().getName());
        System.out.println(apple.getName());
    }
}
