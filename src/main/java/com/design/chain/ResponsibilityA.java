package com.design.chain;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class ResponsibilityA implements Responsibility {


    @Override
    public void process(GoHome goHome, ResponsibilityChain chain) {
        System.out.println("坐动车回家过年");
        int count = goHome.getBuyCount() + 1;
        goHome.setBuyCount(count);
        chain.process(goHome);
    }
}
