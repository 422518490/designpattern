package com.design.command;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class CommandA implements Command {

    @Override
    public void execute() {
        System.out.println("在commandA中执行命令");
    }
}
