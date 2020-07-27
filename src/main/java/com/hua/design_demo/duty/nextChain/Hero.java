package com.hua.design_demo.duty.nextChain;

import lombok.Data;

@Data
public class Hero {
    private String name;

    private int power;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }
}
