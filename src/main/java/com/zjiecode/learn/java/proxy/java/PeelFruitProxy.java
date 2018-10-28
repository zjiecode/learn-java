package com.zjiecode.learn.java.proxy.java;

import com.zjiecode.learn.java.proxy.Fruit;

/**
 * 代理，让每个水果去皮
 */
public class PeelFruitProxy implements Fruit {
    private Fruit mFruit;

    public PeelFruitProxy(Fruit fruit) {
        this.mFruit = fruit;
    }
    @Override
    public String getName() {
        return "去皮的" + mFruit.getName();
    }
}
