package com.company.implementations;

import com.company.Dj;
import com.company.MusicBand;

public class DjAdapter implements MusicBand{
    Dj ilanBluestone;

    public DjAdapter(Dj dj) {
        ilanBluestone = dj;
    }
    @Override
    public void setInstruments() {
        ilanBluestone.connectComputer();
    }

    @Override
    public void calibrateInstruments() {
        ilanBluestone.testSound();
    }

    @Override
    public void play() {
        ilanBluestone.mix();
    }
}
