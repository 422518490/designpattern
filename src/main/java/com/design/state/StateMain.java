package com.design.state;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class StateMain {

    public static void main(String [] args){
        CoffeeMachine coffeeMachine = new CoffeeMachine(5);
        coffeeMachine.pay();
        coffeeMachine.buy();
        coffeeMachine.getCoffee();
        coffeeMachine.taken();
    }
}
