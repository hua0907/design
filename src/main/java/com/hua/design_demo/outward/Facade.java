package com.hua.design_demo.outward;

public class Facade {

    SubSystemOne one;
    SubSystemTwo two;
    SubSystemThree three;

    public Facade() {
        this.one = new SubSystemOne();
        this.two = new SubSystemTwo();
        this.three = new SubSystemThree();
    }

    public void buy() {
        one.buy();
        two.buy();
        three.buy();
    }

    public void sell() {
        one.sell();
        two.sell();
        three.sell();
    }

}
