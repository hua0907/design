package com.hua.design_demo.decorate.game;

public class RedBuff extends Buff{
    private Model model;

    public RedBuff(Model model) {
        this.model = model;
    }

    public void out() {
        model.out();
        System.out.println("get red buff");
    }
}
