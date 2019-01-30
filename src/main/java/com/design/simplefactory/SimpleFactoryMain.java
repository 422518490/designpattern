package com.design.simplefactory;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/25
 * @description
 */
public class SimpleFactoryMain {

    public static void main(String [] args){
        MoneyFactory rmb = new MoneyFactory("RMB");
        MoneyFactory us = new MoneyFactory("US");
    }
}
