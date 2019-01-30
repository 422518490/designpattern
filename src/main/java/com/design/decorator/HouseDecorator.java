package com.design.decorator;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description 房子装饰类
 */
public class HouseDecorator implements House{

    private HighRiseHouse highRiseHouse;

    public HouseDecorator(HighRiseHouse highRiseHouse) {
        this.highRiseHouse = highRiseHouse;
    }

    @Override
    public void mopFloor() {
        highRiseHouse.mopFloor();
        System.out.println("打扫卫生装饰加强类");
    }

    @Override
    public void makeDinner() {
        highRiseHouse.makeDinner();
        System.out.println("做饭装饰加强类");
    }
}
