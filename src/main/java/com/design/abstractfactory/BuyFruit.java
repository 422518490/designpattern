package com.design.abstractfactory;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/26
 * @description
 */
public class BuyFruit {

    public static void main(String [] args){
        FactoryProducer factoryProducer = new FactoryProducer();
        Apple apple = (Apple) factoryProducer.getFactory("apple").createFruit();
        Orange orange = (Orange) factoryProducer.getFactory("orange").createFruit();
    }
}
