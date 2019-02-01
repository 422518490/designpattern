package com.design.state;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class CoffeeMachine {
    final State PAY,NO_PAY,SOLD,SOLD_OUT;

    State state;

    int store;

    public CoffeeMachine(int store){
        PAY = new PayState(this);
        NO_PAY = new NoPayState(this);
        SOLD = new SoldState(this);
        SOLD_OUT = new SoldOutState(this);

        this.store = store;

        // 初始化为未付款
        if (this.store > 0){
            this.state = NO_PAY;
        }
    }

    public void pay(){
        this.state.pay();
    }

    public void refund(){
        this.state.refund();
    }

    public void buy(){
        this.state.buy();
    }

    public void getCoffee(){
        this.state.getCoffee();
    }

    public void taken(){
        this.state.taken();
    }
}
