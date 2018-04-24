package src;

public class Meseros implements Waiters {
    @Override
    public String serveTable() {
        return "Atendiendo mesas";
    }

    @Override
    public String attendCook() {
        return "Atendiendo a la cocina";
    }

    @Override
    public String attendBar() {
        return "Atendiendo al bar";
    }
}
