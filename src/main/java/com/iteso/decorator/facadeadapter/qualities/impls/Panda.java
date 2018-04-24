package com.iteso.decorator.facadeadapter.qualities.impls;

import com.iteso.decorator.facadeadapter.qualities.interfaces.MusicBand;

public class Panda implements MusicBand {
    @Override public String toString() {
        return "La banda que tocara será Panda";
    }

    @Override
    public void play() {

    }
}