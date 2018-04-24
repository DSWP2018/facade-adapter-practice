package src;

public class Bebidas implements Drinks {
    @Override
    public String prepare() {
        return "Las bebidas se están preparando";
    }

    @Override
    public boolean alcoholic() {
        return true;
    }

    @Override
    public String serve() {
        return "Las bebidas han sido servidas";
    }
}
