package implementations;

import interfaces.Dinner;

public class Dine implements Dinner {
    @Override
    public String confirmChef() {
        return "Chef confirmed";
    }

    @Override
    public String setKitchen() {
        return "Kitchen set";
    }
}
