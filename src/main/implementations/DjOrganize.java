package implementations;

import interfaces.DJ;

public class DjOrganize implements DJ {
    @Override
    public String connectComputer() {
        return "Computer Connected";
    }

    @Override
    public String connectMixTables() {
        return "Mix Tables Connected";
    }

    @Override
    public String mix() {
        return "Mix DJ";
    }

    @Override
    public String testSound() {
        return "Sound tested";
    }

    @Override
    public String play() {
        return "Play DJ";
    }
}
