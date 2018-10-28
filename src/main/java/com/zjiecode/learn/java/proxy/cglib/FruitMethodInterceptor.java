package com.zjiecode.learn.java.proxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * CGLib代理的方法拦截器
 */
public class FruitMethodInterceptor implements MethodInterceptor{
    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        String result = (String) proxy.invokeSuper(obj, args);//调用原始方法
        return "去皮的"+result;
    }
}
