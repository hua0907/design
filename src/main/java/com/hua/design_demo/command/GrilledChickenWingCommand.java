package com.hua.design_demo.command;

public class GrilledChickenWingCommand extends Command {

    public GrilledChickenWingCommand(Chef chef) {
        super(chef);
    }

    @Override
    public void excuteCommmand() {
        chef.GrilledChickenWing();
    }

    @Override
    public String getString() {
        return StringConstant.CHICKEN_WING;
    }
}
