package com.hua.design_demo.decorate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Person {
    protected String name;

    public abstract void dressUp();
}

