package com.ponchodevelops.com.ponchodevelops.concreteclasses;

import com.ponchodevelops.interfaces.MusicBand;

public class Radiohead implements MusicBand {
    @Override
    public void playSong() {
        System.out.println("Radiohead starts playing 'Creep'");
    }

    @Override
    public void stopPlaying() {
        System.out.println("Radiohead stops playing 'Creep'");
    }
}
