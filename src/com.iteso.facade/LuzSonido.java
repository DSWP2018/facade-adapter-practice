
/**
 * Benefits Decorator.
 */
public class LuzSonido {
    private int luces;
    private int sonido;
    private boolean ready;

    public LuzSonido(int luces, int sonido) {
        this.luces = luces;
        this.sonido = sonido;
        ready = false;
    }

    public String ponerLuzSonido() {
        ready = true;
        return "Se prepararon " + luces + "luces y " + sonido + "equipos de sonido";
    }

    public String prenderLuz() {
        if(ready) return "Se predió la luz y el sonido.";
        else return "No está listo el equipo";
    }

    public String apagar() {
        return "Se apagó la luz y el sonido.";
    }
    public int getLuces() {
        return luces;
    }

    public void setLuces(int luces) {
        this.luces = luces;
    }

    public int getSonido() {
        return sonido;
    }

    public void setSonido(int sonido) {
        this.sonido = sonido;
    }
}
