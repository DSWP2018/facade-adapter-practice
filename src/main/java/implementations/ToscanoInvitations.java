package implementations;

import interfaces.PartyInvitations;

public class ToscanoInvitations implements PartyInvitations {
    @Override
    public boolean setUp() {
        return true;
    }

    @Override
    public boolean takeDown() {
        return false;
    }
}
