package com.design.decorator;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description
 */
public class HighRiseHouse implements House {
    @Override
    public void mopFloor() {
        System.out.println("打扫卫生");
    }

    @Override
    public void makeDinner() {
        System.out.println("做饭");
    }
}
