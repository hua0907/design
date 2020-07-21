package com.hua.design_demo.strategy.tank;

public class RedTank extends Tank implements Fire{
    @Override
    public void openFire() {
        System.out.println("readTank openFire！da...da...da... ");
    }
}
