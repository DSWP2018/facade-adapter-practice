package mx.iteso.dsw.graduacion.implement;

import mx.iteso.dsw.graduacion.interfaces.DJ;

public class DJ {
    public void haciendoAmbiente() {
        System.out.println("Dj sonando");
    }

    @Override public String toString() {
        return "DJ ha llegado";
    }
}
