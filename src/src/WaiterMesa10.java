import com.sun.deploy.util.Waiter;

public class WaiterMesa10 implements Waiters {
    @Override
    public void serveTable() {
        System.out.println("El mesero sirvió los platos a la mesa 10");
    }

    @Override
    public void attendPeople() {
        System.out.println("El mesero atendió las mesa 10");
    }
}
