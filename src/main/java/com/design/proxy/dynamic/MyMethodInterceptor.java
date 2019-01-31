package com.design.proxy.dynamic;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Optional;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class MyMethodInterceptor implements MethodInterceptor {

    private Object target;

    public MyMethodInterceptor(Object target) {
        this.target = target;
    }

    @Override
    public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        // 前置增强
        handleBefore();
        Object obj = null;
        // 调用父类的方法，只能用于继承的时候,接口实现不能使用
        //obj = methodProxy.invokeSuper(proxy,args);
        if (Optional.ofNullable(target).isPresent()){
            obj = method.invoke(target,args);
        }
        // 后置增强
        handleAfter();
        return obj;
    }

    private void handleBefore(){
        System.out.println("我先去看看可不可以约");
    }

    private void handleAfter(){
        System.out.println("这个girl可以好好相处");
    }
}
