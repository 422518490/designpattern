package com.design.singleton;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description 单线程安全
 */
public class LazyUnSafe2 {

    private static LazyUnSafe2 instance;

    private LazyUnSafe2(){

    }

    public static LazyUnSafe2 getInstance(){
        if (instance == null){
            synchronized (LazyUnSafe2.class){
                instance = new LazyUnSafe2();
            }
        }
        return instance;
    }
}
