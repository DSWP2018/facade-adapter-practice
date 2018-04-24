package com.iteso.decorator.facadeadapter.qualities.impls;

import com.iteso.decorator.facadeadapter.qualities.interfaces.Food;

public class Pollo implements Food {
    @Override public String toString() {
        return "La cena es pollo";
    }
}
