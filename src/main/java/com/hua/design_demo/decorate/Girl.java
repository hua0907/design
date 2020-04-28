package com.hua.design_demo.decorate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Girl extends Person {

    @Override
    public void dressUp() {
        System.out.println("I am a girl, my name is " + getName());
    }
}
