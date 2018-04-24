package mx.iteso.dsw.graduacion.interfaces;
import mx.iteso.dsw.graduacion.implement.*;


public class GraduationFacade {
    private Banda band;
    private Utencilios utencilios;
    private Terraza lugar;
    private Mantel manteles;
    private Mesas mesas;
    private Sillas sillas;
    private Vajillas vajilla;

    public GraduationFacade(Banda band, Utencilios utencilios, Terraza lugar, Mantel manteles, Mesas mesas, Sillas sillas, Vajillas vajilla) {
        this.band = band;
        this.utencilios = utencilios;
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
        System.out.println(utencilios);
        band.tocar();
    }
}
