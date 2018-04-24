import sun.security.util.DerEncoder;

public class Margarita implements Drinks {
    @Override
    public void prepare() {
        System.out.println("Se preparó una margarita con limón");
    }

    @Override
    public void serve() {
        System.out.println("Se sirvió en la copa más fina");
    }

    @Override
    public boolean alcoholic() {
        return true;
    }
}
