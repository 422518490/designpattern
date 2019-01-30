package com.design.decorator;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description
 */
public class HouseDecoratorB extends HouseDecorator {

    public HouseDecoratorB(HighRiseHouse highRiseHouse) {
        super(highRiseHouse);
    }

    @Override
    public void mopFloor() {
        super.mopFloor();
        System.out.println("打扫卫生加强类B");
    }

    @Override
    public void makeDinner() {
        super.makeDinner();
        System.out.println("做饭加强类B");
    }
}
