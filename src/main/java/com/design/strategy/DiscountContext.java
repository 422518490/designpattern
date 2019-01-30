package com.design.strategy;

import java.math.BigDecimal;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/25
 * @description 使用策略模式的类
 */
public class DiscountContext {

    private Discount discount;

    public DiscountContext(Discount discount){
        this.discount = discount;
    }

    public BigDecimal calculatePrice(BigDecimal price){
        return discount.countDiscountValue(price);
    }
}
