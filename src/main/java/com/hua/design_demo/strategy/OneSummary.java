package com.hua.design_demo.strategy;

public class OneSummary implements Summary {

    @Override
    public void settle(int total) {
        System.out.println("消费:" + total * 0.8);
    }
}
