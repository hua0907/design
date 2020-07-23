package com.hua.design_demo.factory.abstractFactory;

public class SecondFactory extends AbstractFactory {

    @Override
    public Tank createTank() {
        return new RedTank();
    }

    @Override
    public Bullet createBullet() {
        return new TriangleBullet();
    }

    @Override
    public Spark createSpark() {
        return new PurpleSpark();
    }
}
