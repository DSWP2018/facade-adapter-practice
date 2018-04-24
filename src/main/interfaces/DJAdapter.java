package interfaces;

public class DJAdapter implements MusicBand {

    DJ dj;
    public DJAdapter(DJ dj1){
      this.dj=dj1;
    }
    @Override
    public String setInstruments() {
        return dj.connectMixTables();
    }

    @Override
    public String calibrateSound() {
        return dj.connectComputer();
    }

    @Override
    public String testSound() {
        return dj.testSound();
    }

    @Override
    public String play() {
        return dj.play();
    }
}
