

import java.util.ArrayList;

/**
 * Benefits Decorator.
 */
public class Main2 {
    public static void main(final String[] args) {
        FiestaFacade fiesta = new FiestaFacade(
                new Alcohol(3, 4, 2, 1),
                new Banda("Muse", 6, "rock"),
                new Comida("Carne Asada", "Pastel Chocolate", "Ensalada","Carmen Martinez"),
                new Decoracion("Flores", true, "Temática de Viajes"),
                new Lugar("TrasLoma"),
                new LuzSonido(20, 30),
                new Servicio(40, 6));
        fiesta.prepararFiesta();
        fiesta.festejar();
        fiesta.terminar();

        DJDavid david = new DJDavid();
        InterfaceBanda bandaDavid = new DJAdapter(david);

        FiestaFacade fiesta2 = new FiestaFacade(
                new Alcohol(3, 4, 2, 1),
                bandaDavid,
                new Comida("Carne Asada", "Pastel Chocolate", "Ensalada","Carmen Martinez"),
                new Decoracion("Flores", true, "Temática de Viajes"),
                new Lugar("TrasLoma"),
                new LuzSonido(20, 30),
                new Servicio(40, 6));
        fiesta2.prepararFiesta();
        fiesta2.festejar();
        fiesta2.terminar();

    }
}
