package com.hua.design_demo.strategy.tank;

public class GreenTank extends Tank implements Fire{
    @Override
    public void openFire() {
        System.out.println("greenTank openFire！jiu...jiu...jiu... ");
    }
}
