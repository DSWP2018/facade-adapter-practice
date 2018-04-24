public class DJtoMusicBandAdapter implements MusicBand{

    DJ dj = new Avicii();

    @Override
    public String setInstruments() {
        return "Bitch please, I'm a DJ, I just need a mixtable";
    }

    @Override
    public String calibrateSound() {
        return "I'm a DJ, I don't do this things";
    }

    @Override
    public String testSound() {
        return dj.testSound();
    }

    @Override
    public String play() {
        return dj.mix() + ", " + dj.playMusic();
    }
}
