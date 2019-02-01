package com.design.template;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/2/1
 * @description
 */
public class UserMain {

    public static void main(String [] args){
        Game game = new Football();
        game.play();
        System.out.println("********************");
        game = new HonorOfKings();
        game.play();
    }
}
