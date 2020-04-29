package com.hua.design_demo.strategy;

public class Test {
    public static void main(String[] args) {
        SummaryFactory factory = new SummaryFactory();
        Summary summary = factory.createSummary(DiscountEnum.TWENTY_PERCENT);
        summary.settle(300);

        summary = factory.createSummary(DiscountEnum.FULL_ONE_HUNDRED_REDUCTION_TWENTY);
        summary.settle(300);

        summary = factory.createSummary(DiscountEnum.FULL_THREE_HUNDRED_REDUCTION_EIGHTY);
        summary.settle(300);
    }
}
