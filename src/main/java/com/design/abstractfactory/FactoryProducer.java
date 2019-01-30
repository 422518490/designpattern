package com.design.abstractfactory;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/26
 * @description
 */
public class FactoryProducer {

    public AbstractFactory getFactory(String type){
        AbstractFactory abstractFactory;
        switch (type){
            case "apple":
                abstractFactory = new AppleFactory();
                break;
            case "orange":
                abstractFactory = new OrageFactory();
                break;
            case "peach":
                abstractFactory = new PeachFactory();
                break;
            default:
                abstractFactory = null;
        }
        return abstractFactory;
    }
}
