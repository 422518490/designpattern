package com.design.singleton;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class StaticClassSafe {

    private StaticClassSafe(){

    }

    private static class Instance{
        private static final StaticClassSafe INSTANCE = new StaticClassSafe();
    }

    public static StaticClassSafe getInstance(){
        return Instance.INSTANCE;
    }

}
