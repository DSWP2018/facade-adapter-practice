package implementations;

import interfaces.PartySecurity;

public class ToscanoSecurity implements PartySecurity {
    @Override
    public boolean setUp() {
        return true;
    }

    @Override
    public boolean takeDown() {
        return false;
    }
}
