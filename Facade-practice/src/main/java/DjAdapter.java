public class DjAdapter implements MusicBand{

    DJ dj;

    public void setDj(DJ dj) {
        this.dj = dj;
    }

    @Override
    public void setInstrument() {
        dj.connectComputer();
    }

    @Override
    public void calibrateSound() {
        dj.connectMixTablet();
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
