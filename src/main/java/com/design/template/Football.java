package com.design.template;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class Football extends Game {
    @Override
    protected void initialize() {
        System.out.println("准备足球");
    }

    @Override
    protected void startPlay() {
        System.out.println("用脚踢球");
    }

    @Override
    protected void endPlay() {
        System.out.println("球射门了");
    }
}
