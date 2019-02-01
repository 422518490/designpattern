package com.design.singleton;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class BlockHungerHan {

    private static BlockHungerHan instance;

    static {
        instance = new BlockHungerHan();
    }

    private BlockHungerHan(){

    }

    public static BlockHungerHan getInstance(){
        return instance;
    }
}
