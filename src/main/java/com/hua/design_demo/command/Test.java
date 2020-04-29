package com.hua.design_demo.command;

public class Test {
    public static void main(String[] args) {
        Chef chef = new Chef();

        GrilledChickenWingCommand grilledChickenWingCommand = new GrilledChickenWingCommand(chef);
        GrilledMuttonCommand grilledMuttonCommand = new GrilledMuttonCommand(chef);
        GrilledLeeksCommand grilledLeeksCommand = new GrilledLeeksCommand(chef);

        Waiter waiter = new Waiter();
        waiter.saveOrder(grilledChickenWingCommand);
        waiter.saveOrder(grilledMuttonCommand);
        waiter.saveOrder(grilledLeeksCommand);

        waiter.notifyChef();

    }
}
