package com.design.adapter;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class PowerAdapter extends Phone {

    private Electric electric;

    public PowerAdapter(Electric electric) {
        this.electric = electric;
    }

    @Override
    public void name() {
        super.name();
        System.out.println("我是电源适配器，我来连接手机和电流");
        electric.say();
    }
}
