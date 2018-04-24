package com.company.implementations;

import com.company.Food;

public class MyFood implements Food {
    @Override
    public void serveDishes() {
        System.out.println("Serving food");
    }
}
