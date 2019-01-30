package com.design.strategy;

import java.math.BigDecimal;

/**
 * @author liaoyubo
 * @version 1.0 2019/1/25
 * @description
 */
public class DiscountMain {

    public static void main(String [] args){
        Discount fullTenReduceOne = new FullTenReduceOne();
        Discount buyThreeFreeOne = new BuyThreeFreeOneDiscount();

        DiscountContext discountContext = new DiscountContext(buyThreeFreeOne);
        BigDecimal threeFreeOne = discountContext.calculatePrice(new BigDecimal(50));
        System.out.println("买3免1的价格:" + threeFreeOne);

        discountContext = new DiscountContext(fullTenReduceOne);
        BigDecimal tenReduceOne = discountContext.calculatePrice(threeFreeOne);
        System.out.println("满10减1的价格:" + tenReduceOne);
    }

}
