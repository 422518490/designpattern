package com.design.facade;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class FacadeList {

    public void facadeList(){
        FacadeA facadeA = new FacadeA();
        FacadeB facadeB = new FacadeB();
        facadeA.facadeA();
        facadeB.facadeB();
    }

}
