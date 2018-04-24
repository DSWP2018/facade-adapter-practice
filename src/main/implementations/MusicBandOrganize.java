package implementations;

import interfaces.MusicBand;

public class MusicBandOrganize implements MusicBand {
    @Override
    public String setInstruments() {
        return "Instruments set";
    }

    @Override
    public String calibrateSound() {
        return "Sound calibrated";
    }

    @Override
    public String testSound() {
        return "Sound tested";
    }

    @Override
    public String play() {
        return "Music played";
    }
}
