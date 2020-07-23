package com.hua.design_demo.decorate.game;

public class BlueBuff extends Buff{
    private Model model;

    public BlueBuff(Model model) {
        this.model = model;
    }

    public void out() {
        model.out();
        System.out.println("get blue buff");
    }
}
