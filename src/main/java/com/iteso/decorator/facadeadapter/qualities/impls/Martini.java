package com.iteso.decorator.facadeadapter.qualities.impls;

import com.iteso.decorator.facadeadapter.qualities.interfaces.Drinks;

public class Martini implements Drinks {
    @Override public String toString() {
        return "Martini preparado";
    }
}