package com.zjiecode.learn.java.proxy.java;

import com.zjiecode.learn.java.proxy.Apple;
import com.zjiecode.learn.java.proxy.Banana;

public class Main {
    public static void main(String[] args) {
        Apple apple=new Apple();//原始的苹果
        Banana banana=new Banana();//原始的香蕉

        PeelFruitProxy peelApple=new PeelFruitProxy(apple);//代理,添加去皮功能
        PeelFruitProxy peelBanana=new PeelFruitProxy(banana);//代理,添加去皮功能
        System.out.println(peelApple.getName());
        System.out.println(peelBanana.getName());
    }
}
