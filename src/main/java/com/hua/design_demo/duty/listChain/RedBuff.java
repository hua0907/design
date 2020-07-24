package com.hua.design_demo.duty.listChain;

public class RedBuff extends Buff {

    @Override
    public Hero increase(Hero hero) {
        System.out.println("red buff before,power: " + hero.getPower());
        hero.setPower(hero.getPower() + 100);
        System.out.println("red buff after,power: " + hero.getPower());
        return hero;
    }
}
