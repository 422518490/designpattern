package com.design.state;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public interface State {

    void  pay();

    void refund();

    void buy();

    void getCoffee();

    void taken();
}
