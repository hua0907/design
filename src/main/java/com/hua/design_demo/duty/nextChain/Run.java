package com.hua.design_demo.duty.nextChain;

public class Run {
    public static void main(String[] args) {
        Hero liBai = new Hero("LiBai", 1);

        RedBuff redBuff = new RedBuff();
        BlueBuff blueBuff = new BlueBuff();

        redBuff.setNext(blueBuff);
        redBuff.increase(liBai);
    }
}
