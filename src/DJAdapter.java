public class DJAdapter implements Band{

    DJ dj;

    public DJAdapter(DJ dj){
        this.dj = dj;
    }

    @Override
    public void setInstruments() {
        dj.settingUp();
    }

    @Override
    public void calibrateSound() {
        dj.calibrateSound();
    }

    @Override
    public void testInstruments() {
        dj.testingTable();
    }

    @Override
    public void startPlaying() {
        dj.start();
    }
}
