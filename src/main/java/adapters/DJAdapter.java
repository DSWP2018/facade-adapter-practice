package adapters;

import implementations.Rhye;
import interfaces.DJ;
import interfaces.MusicBand;

public class DJAdapter implements MusicBand{
    DJ dj = new Rhye();

    @Override
    public boolean setUp() {
        if(dj.prepareAct() == "Ready to play!")
            return true;
        else
            return false;
    }

    @Override
    public boolean takeDown() {
        if(dj.endAct() == "Show is over!")
            return true;
        else
            return false;
    }
}
