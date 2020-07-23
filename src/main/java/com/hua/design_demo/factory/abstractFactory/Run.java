package com.hua.design_demo.factory.abstractFactory;

public class Run {
    public static void main(String[] args) {
//        AbstractFactory factory = new FirstFactory();
        AbstractFactory factory = new SecondFactory();

        Bullet bullet = factory.createBullet();
        Spark spark = factory.createSpark();
        Tank tank = factory.createTank();

        tank.color();
        bullet.shape();
        spark.color();
    }
}
