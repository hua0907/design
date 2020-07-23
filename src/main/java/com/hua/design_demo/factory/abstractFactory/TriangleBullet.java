package com.hua.design_demo.factory.abstractFactory;

public class TriangleBullet extends Bullet{
    @Override
    public void shape() {
        System.out.println("triangle bullet");
    }
}
