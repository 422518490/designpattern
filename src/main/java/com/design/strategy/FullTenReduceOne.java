package com.design.strategy;

import java.math.BigDecimal;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/25
 * @description 满10减1
 */
public class FullTenReduceOne implements Discount{
    @Override
    public BigDecimal countDiscountValue(BigDecimal price) {
        if (price.compareTo(new BigDecimal(10)) >= 0){
            return price.subtract(new BigDecimal(1));
        }
        return price;
    }
}
