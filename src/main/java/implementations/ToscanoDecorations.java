package implementations;

import interfaces.PartyDecorations;

public class ToscanoDecorations implements PartyDecorations {
    @Override
    public boolean setUp() {
        return true;
    }

    @Override
    public boolean takeDown() {
        return false;
    }
}
