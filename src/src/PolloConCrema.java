public class PolloConCrema implements Dinner {
    @Override
    public void prepare() {
        System.out.println("Se preparó el pollo con crema y su guarnición");
    }

    @Override
    public void serve() {
        System.out.println("Se sirvió en los platos la cena");
    }
}
