package com.design.state;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class SoldOutState implements State {

    private CoffeeMachine coffeeMachine;

    public SoldOutState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void pay() {
        System.out.println("已经购买成功，请取走");
    }

    @Override
    public void refund() {
        System.out.println("已经购买成功，请取走");
    }

    @Override
    public void buy() {
        System.out.println("已经购买成功，请取走");
    }

    @Override
    public void getCoffee() {
        System.out.println("已经购买成功，已取走");
    }

    @Override
    public void taken() {
        System.out.println("coffee已取走");
        this.coffeeMachine.state = this.coffeeMachine.NO_PAY;
    }
}
