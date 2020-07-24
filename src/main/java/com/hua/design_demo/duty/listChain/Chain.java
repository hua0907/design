package com.hua.design_demo.duty.listChain;

import java.util.ArrayList;
import java.util.List;

public class Chain {
    private List<Buff> buffList = new ArrayList<>();

    public void add(Buff buff) {
        buffList.add(buff);
    }

    public void execute(Hero hero) {
        for (Buff buff : buffList) {
            hero = buff.increase(hero);
        }
    }
}
