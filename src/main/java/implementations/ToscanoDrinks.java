package implementations;

import interfaces.PartyDrinks;

public class ToscanoDrinks implements PartyDrinks {
    @Override
    public boolean setUp() {
        return true;
    }

    @Override
    public boolean takeDown() {
        return false;
    }
}
