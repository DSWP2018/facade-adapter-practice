public class DJAdapter implements MusicBand {
    DJ dj;

    public DJAdapter(DJ dj){
        this.dj = dj;
    }

    @Override
    public void setInstruments() {
        dj.connectComputer();
        dj.connectMixTable();
       // System.out.println("Set Instruments");
    }

    @Override
    public void calibrateSound() {
        dj.calibrateSound();
       // System.out.println("calibrate sound");
    }

    @Override
    public void testSound() {
        dj.checkSound();
       // System.out.println("test sound");
    }

    @Override
    public void play() {
        dj.mix();
       // System.out.println("play the music woo");
    }

    @Override
    public void stop() {
        dj.stop();
       // System.out.println("stop");
    }
}
