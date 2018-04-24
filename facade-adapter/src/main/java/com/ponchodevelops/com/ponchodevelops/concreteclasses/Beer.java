package com.ponchodevelops.com.ponchodevelops.concreteclasses;

import com.ponchodevelops.interfaces.Drinks;

public class Beer implements Drinks {
    @Override
    public void drink() {
        System.out.println("Beer is being drunk");
    }
}
