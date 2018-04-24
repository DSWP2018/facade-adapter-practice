
/**
 * Benefits Decorator.
 */
public class Servicio {
    private int meseros;
    private int horas;
    private boolean enServicio;

    public Servicio(int meseros, int horas) {
        this.meseros = meseros;
        this.horas = horas;
    }

    public String aTrabajar() {
        enServicio = true;
        return "Servicio trabajando";
    }

    public String terminar() {
        enServicio = false;
        return "Servicio terminó.";
    }

    public int getMeseros() {
        return meseros;
    }

    public void setMeseros(int meseros) {
        this.meseros = meseros;
    }

    public boolean isEnServicio() {
        return enServicio;
    }
}
