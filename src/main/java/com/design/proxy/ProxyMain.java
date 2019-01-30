package com.design.proxy;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description
 */
public class ProxyMain {

    public static void main(String [] args){
        TuHao tuHao = new TuHao();
        Girl girl = new Chang();
        GirlProxy girlProxy = new GirlProxy();
        girlProxy.setGirl(girl);
        tuHao.meeting(girlProxy);
    }
}
