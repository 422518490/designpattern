package com.design.chain;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liaoyubo
 * @version 1.0
 * @date 2019/1/31
 * @description
 */
public class ResponsibilityChain {

    private List<Responsibility> responsibilityList;

    private int index = 0;

    public ResponsibilityChain() {
        this.responsibilityList = new ArrayList<>(2);
    }

    public GoHome process(GoHome goHome){
        if (index < responsibilityList.size()){
            responsibilityList.get(index++).process(goHome,this);
        }
        return goHome;
    }

    public void resgiterResponsibility(Responsibility responsibility){
        responsibilityList.add(responsibility);
    }
}
