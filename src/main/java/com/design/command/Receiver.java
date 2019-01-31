package com.design.command;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class Receiver {

    private Map<String,Command> commandMap = new HashMap();

    public void register(String commandType,Command command){
        commandMap.put(commandType,command);
    }

    public void receive(String commandType){
        Command command = commandMap.get(commandType);
        if (Optional.ofNullable(command).isPresent()){
            command.execute();
            return;
        }

        System.out.println("不支持此命令类型:" + commandType);

    }
}
