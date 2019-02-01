package com.design.template;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public abstract class Game {

    public final void play(){
        initialize();

        startPlay();

        endPlay();
    }

    protected abstract void initialize();

    protected abstract void startPlay();

    protected abstract void endPlay();

}
