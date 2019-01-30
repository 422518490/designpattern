package com.design.strategy;

import java.math.BigDecimal;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/25
 * @description 满20减3
 */
public class FullTwentyReduceThree implements Discount{
    @Override
    public BigDecimal countDiscountValue(BigDecimal price) {
        if (price.compareTo(new BigDecimal(20)) >= 0){
            return price.subtract(new BigDecimal(3));
        }
        return price;
    }
}
