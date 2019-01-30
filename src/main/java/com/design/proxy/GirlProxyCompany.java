package com.design.proxy;

import java.lang.reflect.Proxy;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description
 */
public class GirlProxyCompany {

    public static Object proxy(Object target){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),new GirlProxyInvocationHandler(target));
    }
}
