package com.design.simplefactory;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/25
 * @description 简单工厂模式
 */
public class MoneyFactory {

    public MoneyFactory(String money){
        switch (money){
            case "RMB":
                new RMB();
                break;
            case "US":
                new US();
                break;
            case "UN":
                new UN();
                break;
            default:
                ;
        }
    }
}
