package implementations;

import interfaces.PartyLights;

public class ToscanoLights implements PartyLights {
    @Override
    public boolean setUp() {
        return true;
    }

    @Override
    public boolean takeDown() {
        return false;
    }
}
