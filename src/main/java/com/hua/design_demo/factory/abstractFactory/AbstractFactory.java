package com.hua.design_demo.factory.abstractFactory;

public abstract class AbstractFactory {
    public abstract Tank createTank();
    public abstract Bullet createBullet();
    public abstract Spark createSpark();
}
