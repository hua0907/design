package com.hua.design_demo.adapter;

public class ForeignPlayer extends Player {
    public ForeignPlayer(String name) {
        super(name);
    }

    @Override
    public void attack() {
        System.out.println(name + "我是外地球员,我要进攻了！");
    }
}
