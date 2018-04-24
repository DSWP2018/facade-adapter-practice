

/**
 * Benefits Decorator.
 */
public class Banda implements InterfaceBanda{
    public String nombre;
    private int numeroMiembros;
    private String genero;
    private int status;
    private boolean calibrado;

    public Banda(String nombre, int numeroMiembros, String genero) {
        this.nombre = nombre;
        this.numeroMiembros = numeroMiembros;
        this.genero = genero;
    }

    public String play(){
        status = 1;
        return "Tocando";
    }

    public String breakTime() {
        status = 2;
        return "Descanso de la banda";
    }

    public String stop() {
        status = 3;
        return "Terminó la banda";
    }

    public String getStatus() {
        if(status == 1) return "THE BAND IS PLAYING";
        if(status == 0) return "THE BAND IS NO PLAYING";
        if(status == 2) return "THE BAND IS ON BREAK";
        return "Error";
    }

    public String setCalibrado (boolean c) {
        calibrado = c;
        return "Se calibraron los equipos.";
    }

    public boolean isCalibrado() {
        return calibrado;
    }


}
