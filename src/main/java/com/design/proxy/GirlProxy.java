package com.design.proxy;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/27
 * @description
 */
public class GirlProxy implements Girl {

    private Girl girl;

    public Girl getGirl() {
        return girl;
    }

    public void setGirl(Girl girl) {
        this.girl = girl;
    }

    @Override
    public void meeting() {
        girl.meeting();
    }
}
