package com.hua.design_demo.strategy;

public class ThreeSummary implements Summary {
    @Override
    public void settle(int total) {
        System.out.println("消费：" + (total - 80 * (total / 300)));
    }
}
