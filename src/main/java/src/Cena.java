package src;

public class Cena implements Dinner {
    @Override
    public String prepare() {
        return "La cena se está preparando";
    }

    @Override
    public String serve() {
        return "Cena servida";
    }
}
