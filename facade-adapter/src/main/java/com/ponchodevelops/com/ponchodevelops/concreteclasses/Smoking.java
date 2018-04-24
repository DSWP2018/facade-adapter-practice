package com.ponchodevelops.com.ponchodevelops.concreteclasses;

import com.ponchodevelops.interfaces.Suit;

public class Smoking implements Suit {
    @Override
    public void wear() {
        System.out.println("Some fancy guest is wearing a Smoking");
    }
}
