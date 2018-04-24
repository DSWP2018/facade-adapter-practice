public class DJAdapter implements MusicBand{
    DJ dj = new AVICII();

    @Override
    public void playSong() {
        dj.playMix();
        dj.playCumbias();
        dj.playReggaeton();
    }

    @Override
    public void takeABreak() {
        dj.takeABreak();
    }

    @Override
    public void getPaid() {
        dj.getPaidbyEvent();
    }

    @Override
    public void askWhereSingleLadiesAt() {
        dj.getPeopleToDance();
        dj.askIfTheyAreReadyToParty();
    }
}
