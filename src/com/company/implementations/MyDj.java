package com.company.implementations;

import com.company.Dj;

public class MyDj implements Dj {
    @Override
    public void connectComputer() {
        System.out.println("Connecting computer");
    }

    @Override
    public void testSound() {
        System.out.println("Testing Sound");
    }

    @Override
    public void mix() {
        System.out.println("Mixing");
    }
}
