package adapter;

import interfaces.MusicBand;

public class DJAdapter implements MusicBand {

    DJ dj;

    public DJAdapter(DJ dj) {
        this.dj = dj;
    }

    @Override
    public void setInstruments() {
        dj.setEquipment();
    }

    @Override
    public void calibrateSound() {
        dj.calibrateMixTable();
    }

    @Override
    public void testSound() {
        dj.testSound();
    }

    @Override
    public void play() {
        dj.mix();
    }

}
