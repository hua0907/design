package com.hua.design_demo.adapter;

public class Test {
    public static void main(String[] args) {
        NativePlayer jack = new NativePlayer("jack");
        ForeignPlayer ming = new ForeignPlayer("小明");

        jack.attack();
        Translation t = new Translation("translation", ming);
        t.attack();

    }
}
