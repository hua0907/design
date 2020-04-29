package com.hua.design_demo.strategy;

public class Test {
    public static void main(String[] args) {
        SummaryFacade.getResult(DiscountEnum.TWENTY_PERCENT,200);
        SummaryFacade.getResult(DiscountEnum.FULL_ONE_HUNDRED_REDUCTION_TWENTY,200);
        SummaryFacade.getResult(DiscountEnum.FULL_THREE_HUNDRED_REDUCTION_EIGHTY,200);
    }
}
