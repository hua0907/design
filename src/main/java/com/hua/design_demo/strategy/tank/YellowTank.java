package com.hua.design_demo.strategy.tank;

public class YellowTank extends Tank implements Fire {
    @Override
    public void openFire() {
        System.out.println("yellowTank openFire！biu...biu...biu... ");
    }
}
