package com.hua.design_demo.decorate.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Run {
    public static void main(String[] args) {
        Hero hero = new Hero();
        RedBuff redBuff = new RedBuff(hero);
        BlueBuff blueBuff = new BlueBuff(redBuff);

        blueBuff.out();
    }
}
