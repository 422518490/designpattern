package com.design.chain;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class GoHome {

    private int buyCount = 0;

    public void goHome(){
        System.out.println("过年了，回家了,买了" + buyCount + "次票");
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }
}
