package com.company;

public class DJAdapter implements Music{

    DJ dj;

    public DJAdapter(DJ dj){
        this.dj = dj;
    }


    @Override
    public void play() {
        dj.play();
    }

    @Override
    public void prepare() {
        dj.prepare();
    }

    @Override
    public void setInstruments() {
        dj.setComputer();
    }

    @Override
    public void calibrateSound() {
        dj.calibrateSoundLikeAProperDJ();
    }

    @Override
    public void testSound() {
        dj.testSoundLikeAProperDJ();
    }
}
