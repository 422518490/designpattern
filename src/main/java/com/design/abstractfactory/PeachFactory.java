package com.design.abstractfactory;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/26
 * @description
 */
public class PeachFactory implements AbstractFactory {
    @Override
    public Fruit createFruit() {
        return new Peach();
    }
}
