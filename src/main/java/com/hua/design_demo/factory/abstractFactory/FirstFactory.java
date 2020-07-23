package com.hua.design_demo.factory.abstractFactory;

public class FirstFactory extends AbstractFactory {

    @Override
    public Tank createTank() {
        return new GreenTank();
    }

    @Override
    public Bullet createBullet() {
        return new SquareBullet();
    }

    @Override
    public Spark createSpark() {
        return new BlackSpark();
    }
}
