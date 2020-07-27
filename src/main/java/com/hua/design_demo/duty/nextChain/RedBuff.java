package com.hua.design_demo.duty.nextChain;


public class RedBuff extends Buff {

    @Override
    public void increase(Hero hero) {
        System.out.println("red buff before, power: " + hero.getPower());
        hero.setPower(hero.getPower() + 100);
        System.out.println("red buff after, power: " + hero.getPower());
        if (null != this.next) {
            next.increase(hero);
        }
    }
}
