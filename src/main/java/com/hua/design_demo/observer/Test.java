package com.hua.design_demo.observer;

public class Test {
    public static void main(String[] args) {
        Subject subject = new BoosSubject("boos", "走了");

        AlphaObserver alpha = new AlphaObserver(subject, "alpha");
        BetaObserver beta = new BetaObserver(subject, "beta");
        subject.add(alpha);
        subject.add(beta);

        subject.notifyOb();

        subject = new BoosSubject("manager", "回来了");

        alpha = new AlphaObserver(subject, "alpha");
        beta = new BetaObserver(subject, "beta");
        subject.add(alpha);
        subject.add(beta);

        subject.notifyOb();
    }
}
