package com.ponchodevelops.com.ponchodevelops.concreteclasses;

import com.ponchodevelops.interfaces.Lights;

public class Neon implements Lights {
    @Override
    public void turnOn() {
        System.out.println("Neon lights at the party are on");
    }

    @Override
    public void turnOff() {
        System.out.println("Neon lights at the party are off");
    }
}
