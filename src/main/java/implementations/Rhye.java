package implementations;

import interfaces.DJ;
import interfaces.MusicBand;

public class Rhye implements DJ {
    @Override
    public String prepareAct() {
        return "Ready to play!";
    }

    @Override
    public String endAct() {
        return "Show is over!";
    }
}
