package com.design.state;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class PayState implements State {

    private CoffeeMachine coffeeMachine;

    public PayState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void pay() {
        System.out.println("已支付，请确认购买");
    }

    @Override
    public void refund() {
        System.out.println("退款成功，请收好");
        this.coffeeMachine.state = this.coffeeMachine.NO_PAY;
    }

    @Override
    public void buy() {
        System.out.println("购买成功，请等待商品下来");
        this.coffeeMachine.state = this.coffeeMachine.SOLD;
    }

    @Override
    public void getCoffee() {
        System.out.println("请先确定购买");
    }

    @Override
    public void taken() {
        System.out.println("请先确定购买");
    }
}
