package com.hua.design_demo.adapter;

public class Translation extends Player{
    private ForeignPlayer foreignPlayer;

    public Translation(String name, ForeignPlayer foreignPlayer) {
        super(name);
        this.foreignPlayer = foreignPlayer;
    }

    @Override
    public void attack() {
        foreignPlayer.attack();
    }
}
