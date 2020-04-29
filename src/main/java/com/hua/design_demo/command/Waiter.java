package com.hua.design_demo.command;

import java.util.ArrayList;
import java.util.List;

public class Waiter {
    private List<Command> commands = new ArrayList<>();

    public void saveOrder(Command command) {
        if (StringConstant.CHICKEN_WING.equals(command.getString())) {
            System.out.println("鸡翅卖完了");
        } else {
            commands.add(command);
            System.out.println("添加订单");
        }
    }

    public void removeOrder(Command command) {
        commands.remove(command);
        System.out.println("删除订单");
    }

    public void notifyChef() {
        commands.forEach(Command::excuteCommmand);
    }
}
