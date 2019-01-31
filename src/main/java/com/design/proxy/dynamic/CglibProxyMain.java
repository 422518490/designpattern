package com.design.proxy.dynamic;

import com.design.proxy.Chang;
import com.design.proxy.Girl;
import net.sf.cglib.proxy.CallbackFilter;
import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class CglibProxyMain {

    static class MyMethodInterceptor1 implements MethodInterceptor {
        private Object target;

        public MyMethodInterceptor1(Object target) {
            this.target = target;
        }

        public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

            System.out.println("**************** " + method.getName());
            // 前置增强
            doSomethingBefore();
            // 返回值
            Object res = null;
            // 调用父类的该方法，当是生成接口的代理时不可调用。
            // Object res = methodProxy.invokeSuper(proxy, args);
            // 通过method来调用被代理对象的方法
            if (this.target != null) {
                res = method.invoke(target, args);
            }
            // 后置增强
            doSomethingAfter();
            return res;
        }

        private void doSomethingBefore() {
            System.out.println("老板你好，这个我试过了，很不错，推荐给你！");
        }

        private void doSomethingAfter() {
            System.out.println("老板你觉得怎样？ 欢迎下次.....");
        }
    };

    public static void main(String [] args){
        Enhancer enhancer = new Enhancer();
        Chang chang = new Chang();

        // 设置增强的回调,只有一个callback
        enhancer.setCallback(new MyMethodInterceptor(chang));

        // 获取接口代理对象
        enhancer.setInterfaces(new Class[]{Girl.class});
        Girl girl = (Girl) enhancer.create();
        girl.meeting();

        System.out.println("************************");

        // 获取类的生成代理对象
        enhancer.setSuperclass(Chang.class);
        enhancer.setInterfaces(null);
        // 当有多个callback时，通过callbackFilter确认使用第几个callback
        enhancer.setCallbackFilter((method) -> 0);
        Chang proxyChang = (Chang) enhancer.create();
        proxyChang.meeting();

    }
}
