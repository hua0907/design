package com.hua.design_demo.strategy.tank;

public class Test {
    private void openFire(Fire tank) {
        tank.openFire();
    }

    public static void main(String[] args) {
        RedTank redTank = new RedTank();
        GreenTank greenTank = new GreenTank();
        YellowTank yellowTank = new YellowTank();
        new Test().openFire(redTank);
        new Test().openFire(greenTank);
        new Test().openFire(yellowTank);
    }
}
