package com.design.decorator;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description
 */
public class DecoratorMain {

    public static void main(String [] args){
        HighRiseHouse highRiseHouse = new HighRiseHouse();
        HouseDecorator houseDecorator = new HouseDecorator(highRiseHouse);
        houseDecorator.mopFloor();
        houseDecorator.makeDinner();

        houseDecorator = new HouseDecoratorA(highRiseHouse);
        houseDecorator.mopFloor();
        houseDecorator.makeDinner();
    }
}
