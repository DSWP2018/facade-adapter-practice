package com.ponchodevelops.com.ponchodevelops.concreteclasses;

import com.ponchodevelops.interfaces.Tables;

public class Family implements Tables {
    @Override
    public void beServed() {
        System.out.println("Some Family guest table is being served right now");
    }
}
