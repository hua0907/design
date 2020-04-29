package com.hua.design_demo.command;

public abstract class Command {
    protected Chef chef;

    public Command(Chef chef) {
        this.chef = chef;
    }

    public Chef getChef() {
        return chef;
    }

    public void setChef(Chef chef) {
        this.chef = chef;
    }

    public abstract void excuteCommmand();

    public abstract String getString();
}
