package com.design.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description
 */
public class GirlProxyInvocationHandler implements InvocationHandler{

    private Object target;

    public GirlProxyInvocationHandler(Object target) {
        this.target = target;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        handleBefore();
        Object object = method.invoke(target,args);
        handleAfter();
        return object;
    }

    private void handleBefore(){
        System.out.println("我先去看看可不可以约");
    }

    private void handleAfter(){
        System.out.println("这个girl可以好好相处");
    }
}
