package com.design.chain;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public interface Responsibility {

    void process(GoHome goHome,ResponsibilityChain chain);
}
