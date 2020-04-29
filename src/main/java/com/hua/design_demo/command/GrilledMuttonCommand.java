package com.hua.design_demo.command;

public class GrilledMuttonCommand extends Command {

    public GrilledMuttonCommand(Chef chef) {
        super(chef);
    }

    @Override
    public void excuteCommmand() {
        chef.GrilledMutton();
    }

    @Override
    public String getString() {
        return StringConstant.MUTTON;
    }
}
