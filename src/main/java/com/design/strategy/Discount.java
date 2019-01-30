package com.design.strategy;

import java.math.BigDecimal;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/25
 * @description 折扣接口类
 */
public interface Discount {

    BigDecimal countDiscountValue(BigDecimal price);
}
