package com.hua.design_demo.decorate;

public class Test {
    public static void main(String[] args) {
        Boy boy = new Boy("jack");
        Jeans jeans = new Jeans();
        Sneakers sneakers = new Sneakers();
        Tshirt tshirt = new Tshirt();

        tshirt.decorate(boy);
        jeans.decorate(tshirt);
        sneakers.decorate(jeans);

        sneakers.dressUp();
    }

}
