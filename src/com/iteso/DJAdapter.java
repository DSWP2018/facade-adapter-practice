package com.iteso;

public class DJAdapter implements Band {
    DJ dj;


    @Override
    public void playSong(String songName) {
        dj.remixSong(songName);
    }

    @Override
    public void stopPlaying() {
        dj.lowerVolume();
    }

    @Override
    public void playBackgroundMusic() {
        dj.playLoop();
    }
}
