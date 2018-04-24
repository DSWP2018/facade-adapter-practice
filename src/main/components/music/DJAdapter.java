package components.music;

public class DJAdapter implements MusicBand {
    DJ dj;

    public DJAdapter(DJ dj){
        this.dj = dj;
    }

    @Override
    public void setInstruments() {
        this.dj.connectEquipment();
    }

    @Override
    public void calibrateSound() {
        this.dj.calibrateEquipment();
    }

    @Override
    public void checkSound() {
        this.dj.checkSound();
    }

    @Override
    public void play() {
        this.dj.play();
    }

    @Override
    public void stop() {
        this.dj.stop();
    }
}
