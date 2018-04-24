package com.ponchodevelops.com.ponchodevelops.concreteclasses;

import com.ponchodevelops.interfaces.Food;

public class TaquitoDePastor implements Food {
    @Override
    public void eat() {
        System.out.println("Some guest is eating a yummy yummy taquito de pastor");
    }
}
