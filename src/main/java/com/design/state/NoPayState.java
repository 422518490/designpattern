package com.design.state;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class NoPayState implements State {

    private CoffeeMachine coffeeMachine;

    public NoPayState(CoffeeMachine coffeeMachine) {
        this.coffeeMachine = coffeeMachine;
    }

    @Override
    public void pay() {
        System.out.println("支付成功");
        this.coffeeMachine.state = this.coffeeMachine.PAY;
    }

    @Override
    public void refund() {
        System.out.println("你尚未支付，请勿乱按");
    }

    @Override
    public void buy() {
        System.out.println("你尚未支付，请勿乱按");
    }

    @Override
    public void getCoffee() {
        System.out.println("你尚未支付，请勿乱按");
    }

    @Override
    public void taken() {
        System.out.println("请先确定购买");
    }


}
