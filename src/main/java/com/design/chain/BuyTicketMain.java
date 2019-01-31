package com.design.chain;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class BuyTicketMain {

    public static void main(String [] args){
        ResponsibilityChain chain = new ResponsibilityChain();
        chain.resgiterResponsibility(new ResponsibilityA());
        chain.resgiterResponsibility(new ResponsibilityB());
        chain.process(new GoHome()).goHome();
    }
}
