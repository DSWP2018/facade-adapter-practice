public class Cena3Tiempos implements Dinner{
    @Override
    public String prepareDinner() {
        return "Preparing dinner";
    }

    @Override
    public String serveDinner() {
        return "Serving dinner";
    }
}
