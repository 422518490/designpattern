package com.design.chain;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class ResponsibilityB implements Responsibility {
    @Override
    public void process(GoHome goHome, ResponsibilityChain chain) {
        System.out.println("算了，还是做高铁吧");
        int count = goHome.getBuyCount() + 1;
        goHome.setBuyCount(count);
        chain.process(goHome);
    }
}
