package mx.iteso.dsw.graduacion;

import mx.iteso.dsw.graduacion.interfaces.*;

public class GraduationFacade {
    private Band band;
    private Cubiertos cubiertos;
    private Lugar lugar;
    private Manteles manteles;
    private Mesas mesas;
    private Sillas sillas;
    private Vajilla vajilla;

    public GraduationFacade(Band band, Cubiertos cubiertos, Lugar lugar, Manteles manteles, Mesas mesas, Sillas sillas, Vajilla vajilla) {
        this.band = band;
        this.cubiertos = cubiertos;
        this.lugar = lugar;
        this.manteles = manteles;
        this.mesas = mesas;
        this.sillas = sillas;
        this.vajilla = vajilla;
    }

    public void organizeGraduation() {
        System.out.println(lugar);
        System.out.println(sillas);
        System.out.println(mesas);
        System.out.println(manteles);
        System.out.println(vajilla);
        System.out.println(cubiertos);
        band.tocar();
    }
}
