package com.design.abstractfactory;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/26
 * @description
 */
public class AppleFactory implements AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Apple();
    }
}
