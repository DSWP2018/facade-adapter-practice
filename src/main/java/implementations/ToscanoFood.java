package implementations;

import interfaces.PartyFood;

public class ToscanoFood implements PartyFood{
    @Override
    public boolean setUp() {
        return true;
    }

    @Override
    public boolean takeDown() {
        return false;
    }
}
