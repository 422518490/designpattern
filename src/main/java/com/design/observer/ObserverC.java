package com.design.observer;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class ObserverC implements Observer {


    @Override
    public void update(Object object) {
        System.out.println("观察者C产生了改变响应:" + object);
    }
}
