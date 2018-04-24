package com.company.implementations;

import com.company.Photographer;

public class MyPhotographer implements Photographer {
    @Override
    public void takePhotos() {
        System.out.println("Taking photos");
    }
}
