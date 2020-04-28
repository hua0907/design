package com.hua.design_demo.adapter;

public class NativePlayer extends Player {
    public NativePlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "I am native player, i will attack");
    }
}
