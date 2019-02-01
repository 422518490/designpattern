package com.design.bridge;


/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class UserMain {

    public static void main(String [] args){
        Shape shape = new Circle();
        shape.color = new Blue();
        shape.draw();
        shape.color.paint();
    }
}
