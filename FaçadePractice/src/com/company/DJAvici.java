package com.company;

public class DJAvici implements DJ {

    @Override
    public void play() {
        System.out.println("Music is ON!");
    }

    @Override
    public void prepare() {
        setComputer();
        calibrateSoundLikeAProperDJ();
        testSoundLikeAProperDJ();
    }

    @Override
    public void setComputer() {
        System.out.println("Setting computer...");
    }

    @Override
    public void calibrateSoundLikeAProperDJ() {
        System.out.println("Calibrating sound as a proper DJ");
    }

    @Override
    public void testSoundLikeAProperDJ() {
        System.out.println("Testing sound as a proper DJ");
    }
}
