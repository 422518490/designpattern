package com.design.adapter;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class UserMain {

    public static void main(String [] args){
        Electric electric = new Electric();
        PowerAdapter powerAdapter = new PowerAdapter(electric);
        powerAdapter.name();
    }
}
