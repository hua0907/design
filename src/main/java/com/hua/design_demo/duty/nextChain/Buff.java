package com.hua.design_demo.duty.nextChain;

public abstract class Buff {

    public Buff next;

    public void setNext(Buff next) {
        this.next = next;
    }

    //    public abstract void setNext(Buff next);

    public abstract void increase(Hero hero);
}
