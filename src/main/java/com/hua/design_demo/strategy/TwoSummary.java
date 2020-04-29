package com.hua.design_demo.strategy;

public class TwoSummary implements Summary {
    @Override
    public void settle(int total) {
        System.out.println("消费：" + (total - 10 * (total / 100)));
    }
}
