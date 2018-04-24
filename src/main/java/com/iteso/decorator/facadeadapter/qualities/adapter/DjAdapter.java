package com.iteso.decorator.facadeadapter.qualities.adapter;

import com.iteso.decorator.facadeadapter.qualities.impls.Avicii;
import com.iteso.decorator.facadeadapter.qualities.interfaces.MusicBand;
import com.iteso.decorator.facadeadapter.qualities.interfaces.DJ;


public class DjAdapter implements MusicBand {
    Avicii avicii;

    public DjAdapter(Avicii avicii) {
        this.avicii = avicii;
    }

    public void play() {
        avicii.startplaying();
    }
}