package com.design.singleton;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description 多线程不安全的单例
 */
public class LazyUnSafe {

    private static LazyUnSafe instance;

    private LazyUnSafe(){

    }

    public static LazyUnSafe getInstance(){
        if (instance == null){
            instance = new LazyUnSafe();
        }
        return instance;
    }
}
