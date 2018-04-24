public class LosPunchis implements MusicBand {
    @Override
    public void playSong() {
        System.out.println("Los punchis tocaron El Bule Bule");
    }

    @Override
    public void takeABreak() {
        System.out.println("La banda se está tomando un descanso");
    }

    @Override
    public void getPaid() {
        System.out.println("La banda cobró por hora");
    }

    @Override
    public void askWhereSingleLadiesAt() {
        System.out.println("La banda gritó: DONDE ESTÁN LAS SOLTERAS!!");
    }
}
