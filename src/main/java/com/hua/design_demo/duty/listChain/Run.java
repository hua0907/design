package com.hua.design_demo.duty.listChain;

public class Run {
    public static void main(String[] args) {
        Hero liBai = new Hero("LiBai", 1);

        Chain chain = new Chain();
        chain.add(new RedBuff());
        chain.add(new BlueBuff());

        chain.execute(liBai);
    }
}
