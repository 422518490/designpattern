package com.design.template;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class HonorOfKings extends Game {
    @Override
    protected void initialize() {
        System.out.println("打开手机上的王者荣耀APP");
    }

    @Override
    protected void startPlay() {
        System.out.println("小短腿射击");
    }

    @Override
    protected void endPlay() {
        System.out.println("推倒水晶");
    }
}
