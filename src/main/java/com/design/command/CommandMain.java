package com.design.command;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class CommandMain {

    public static void main(String [] args){
        Receiver receiver = new Receiver();
        receiver.register("commandA",new CommandA());
        receiver.register("commandB",new CommandB());
        receiver.register("commandC",new CommandC());

        receiver.receive("commandB");

        System.out.println("********");

        receiver.receive("commandD");
    }
}
