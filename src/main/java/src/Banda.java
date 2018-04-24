package src;

public class Banda implements MusicBand {
    @Override
    public String play() {
        return "La Banda esta tocando";
    }

    @Override
    public String askWhereSingleLadiesAre() {
        return "¿Dónde están las solteras?";
    }

    @Override
    public String setInstruments() {
        return "Instrumentos listos";
    }
}
