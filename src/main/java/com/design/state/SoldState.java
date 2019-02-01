package com.design.state;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class SoldState implements State {

    private CoffeeMachine coffeeMachine;

    public SoldState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void pay() {
        System.out.println("你已支付，请选择coffee");
    }

    @Override
    public void refund() {
        System.out.println("你已支付，请选择coffee");
    }

    @Override
    public void buy() {
        System.out.println("你已支付，请选择coffee");
    }

    @Override
    public void getCoffee() {
        System.out.println("购买成功，请取用");
        this.coffeeMachine.state = this.coffeeMachine.SOLD_OUT;
    }

    @Override
    public void taken() {
        System.out.println("请等待商品出来");
    }
}
