package com.hua.design_demo.command;

public class GrilledLeeksCommand extends Command {

    public GrilledLeeksCommand(Chef chef) {
        super(chef);
    }

    @Override
    public void excuteCommmand() {
        chef.GrilledLeeks();
    }

    @Override
    public String getString() {
        return StringConstant.LEEKS;
    }
}
