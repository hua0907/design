package com.hua.design_demo.adapter;

public abstract class Player {
    protected String name;

    public Player(String name) {
        this.name = name;
    }

    public abstract void attack();

}
