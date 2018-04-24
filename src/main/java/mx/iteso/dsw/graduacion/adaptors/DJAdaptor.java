package mx.iteso.dsw.graduacion.adaptors;

import mx.iteso.dsw.graduacion.implement.Banda;
import mx.iteso.dsw.graduacion.implement.DJ;

import mx.iteso.dsw.graduacion.interfaces.*;

public class DJAdaptor extends Banda {
    DJ dj;

    public DJAdaptor(DJ dj) {
        this.dj = dj;
    }

    public void tocar() {
        dj.haciendoAmbiente();
    }
}
