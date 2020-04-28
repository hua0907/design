package com.hua.design_demo.decorate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public abstract class Finery extends Person {
    protected Person person;

    public void decorate(Person comment) {
        this.person = comment;
    }

    public abstract void dressUp();

}
