package com.hua.design_demo.duty.listChain;

public class BlueBuff extends Buff{

    @Override
    public Hero increase(Hero hero) {
        System.out.println("blue buff before,power: " + hero.getPower());
        hero.setPower(hero.getPower() + 300);
        System.out.println("blue buff after,power: " + hero.getPower());
        return hero;
    }
}
