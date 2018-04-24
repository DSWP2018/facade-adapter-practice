package com.iteso.decorator.facadeadapter.qualities.impls;

public class Avicii {
    public void startplaying() {
        System.out.println("DJ está tocando");
    }

    @Override public String toString() {
        return "Avicii arrived";
    }
}
