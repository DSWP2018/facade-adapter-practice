
public class Lugar {
    public String lugar;
    public boolean limpio;

    public Lugar(String lugar) {
        this.lugar = lugar;
    }

    public String limpiar() {
        return "Se limpió el lugar.";
    }
    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public boolean isLimpio() {
        return limpio;
    }

    public void setLimpio(boolean limpio) {
        this.limpio = limpio;
    }
}
