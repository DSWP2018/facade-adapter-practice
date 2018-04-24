package src;

public class DJAdapter implements MusicBand{
DJ gradDJ = new MartinGarrix();

    @Override
    public String play() {
        return gradDJ.play();
    }

    @Override
    public String askWhereSingleLadiesAre() {
        return gradDJ.askIfYouAreReadyToParty();
    }

    @Override
    public String setInstruments() {
        return gradDJ.connectEquipment();
    }

}
