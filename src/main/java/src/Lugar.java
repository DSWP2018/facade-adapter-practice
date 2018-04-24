package src;

public class Lugar implements Venue {
    @Override
    public String rent() {
        return "Lugar rentado";
    }

    @Override
    public String clean() {
        return "Lugar limpio";
    }
}
