package com.company.implementations;

import com.company.Light;

public class MyLight implements Light {
    @Override
    public void turnOn() {
        System.out.println("Turning on lights");
    }

    @Override
    public void turnOff() {
        System.out.println("Turning off lights");
    }
}
