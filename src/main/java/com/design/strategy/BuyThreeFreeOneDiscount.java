package com.design.strategy;

import java.math.BigDecimal;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/25
 * @description 买3减1
 */
public class BuyThreeFreeOneDiscount implements Discount {
    @Override
    public BigDecimal countDiscountValue(BigDecimal price) {
        return price.multiply(new BigDecimal(2));
    }
}
