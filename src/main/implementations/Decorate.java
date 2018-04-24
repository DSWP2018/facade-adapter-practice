package implementations;

import interfaces.Decorations;

public class Decorate implements Decorations {
    @Override
    public String setOutsideDecoration() {
        return "Outside decoration set";
    }

    @Override
    public String setInteriorDecoration() {
        return "Inside decoration set";
    }

    @Override
    public String setBalloons() {
        return "Balloons set";
    }

    @Override
    public String checkLighting() {
        return "Lighting checked";
    }
}
