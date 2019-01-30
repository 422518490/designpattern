package com.design.decorator;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description
 */
public class HouseDecoratorA extends HouseDecorator {

    public HouseDecoratorA(HighRiseHouse highRiseHouse) {
        super(highRiseHouse);
    }

    @Override
    public void mopFloor() {
        super.mopFloor();
        System.out.println("打扫卫生加强类A");
    }

    @Override
    public void makeDinner() {
        super.makeDinner();
        System.out.println("做饭加强类B");
    }
}
