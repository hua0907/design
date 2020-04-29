package com.hua.design_demo.strategy;

public class SummaryFacade {

    public static void getResult(DiscountEnum discountEnum,int total) {
        SummaryFactory factory = new SummaryFactory();
        Summary summary = factory.createSummary(discountEnum);
        summary.settle(total);
    }
}
