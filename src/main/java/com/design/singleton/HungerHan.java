package com.design.singleton;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class HungerHan {

    private final static HungerHan INSTANCE = new HungerHan();

    private HungerHan(){

    }

    private static HungerHan getInstance(){
        return INSTANCE;
    }
}
