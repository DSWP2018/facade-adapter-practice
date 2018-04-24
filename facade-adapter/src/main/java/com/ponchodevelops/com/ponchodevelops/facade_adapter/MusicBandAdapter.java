package com.ponchodevelops.com.ponchodevelops.facade_adapter;

import com.ponchodevelops.com.ponchodevelops.concreteclasses.Radiohead;
import com.ponchodevelops.interfaces.OtherMusicBand;

public class MusicBandAdapter implements OtherMusicBand {
    Radiohead radiohead_again;

    public void playDJ() {
        System.out.println("Now a DJ starts playing 'Movimiento Naranja'");
    }

    public void stopDJ() {
        System.out.println("Now a DJ stops playing 'Movimiento Naranja'");
    }
}
