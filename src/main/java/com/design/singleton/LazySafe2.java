package com.design.singleton;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description 效率低
 */
public class LazySafe2 {

    private static LazySafe2 instance;

    private LazySafe2(){

    }

    public static synchronized LazySafe2 getInstance(){
        if (instance == null){
            instance = new LazySafe2();
        }
        return instance;
    }
}
