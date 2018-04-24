
public class Decoracion {

    String centroMesa = "";
     boolean mantelMesa = false;
     String decoracionExtra = "";


    public Decoracion(String centroMesa, boolean mantelMesa, String decoracionExtra) {
        this.centroMesa = centroMesa;
        this.mantelMesa = mantelMesa;
        this.decoracionExtra = decoracionExtra;
    }

    public String decorar() {
        if(isMantelMesa()){
            return "Se decoró con un centro de mesa: " + getCentroMesa() + ", con manteles de mesa y " + getDecoracionExtra();
        }
        else {
            return "Se decoró con un centro de mesa: " + getCentroMesa() + " y " + getDecoracionExtra();
        }
    }

    public String getCentroMesa() {
        return centroMesa;
    }

    public void setCentroMesa(String centroMesa) {
        this.centroMesa = centroMesa;
    }

    public boolean isMantelMesa() {
        return mantelMesa;
    }

    public void setMantelMesa(boolean mantelMesa) {
        this.mantelMesa = mantelMesa;
    }

    public String getDecoracionExtra() {
        return decoracionExtra;
    }

    public void setDecoracionExtra(String decoracionExtra) {
        this.decoracionExtra = decoracionExtra;
    }
}
