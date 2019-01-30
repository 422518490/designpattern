package com.design.proxy;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description 动态代理
 */
public class DynamicProxyMain {

    public static void main(String [] args){
        TuHao tuHao = new TuHao();
        Girl chang = new Chang();
        Girl girlProxy = (Girl) GirlProxyCompany.proxy(chang);
        tuHao.meeting(girlProxy);
    }
}
