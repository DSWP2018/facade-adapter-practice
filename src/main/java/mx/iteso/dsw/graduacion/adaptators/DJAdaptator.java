package mx.iteso.dsw.graduacion.adaptators;

import mx.iteso.dsw.graduacion.impl.DJSonrisas;
import mx.iteso.dsw.graduacion.interfaces.Band;
import mx.iteso.dsw.graduacion.interfaces.DJ;

public class DJAdaptator implements Band {
    DJSonrisas djSonrisas;

    public DJAdaptator(DJSonrisas djSonrisas) {
        this.djSonrisas = djSonrisas;
    }

    public void tocar() {
        djSonrisas.prenderAmbiente();
    }
}
