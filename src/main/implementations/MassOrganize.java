package implementations;

import interfaces.Mass;

public class MassOrganize implements Mass {

    @Override
    public String confirmPriest() {
        return "Priest confirmed";
    }

    @Override
    public String setSpeakers() {
        return "Speakers assigned";
    }

    @Override
    public String setVolunteers() {
        return "Volunteers set";
    }

    @Override
    public String startMass() {
        return "Mass started";
    }
}
