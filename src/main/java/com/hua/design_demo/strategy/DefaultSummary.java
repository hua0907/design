package com.hua.design_demo.strategy;

public class DefaultSummary implements Summary {
    @Override
    public void settle(int total) {
        System.out.println("消费：" + total);
    }
}
