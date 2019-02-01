package com.design.singleton;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description 双重检查
 */
public class LazySafe {

    private static volatile LazySafe instance;

    private LazySafe(){

    }

    public static LazySafe getInstance(){
        if (instance == null){
            synchronized (LazySafe.class){
                if (instance == null){
                    instance = new LazySafe();
                }
            }
        }
        return instance;
    }
}
