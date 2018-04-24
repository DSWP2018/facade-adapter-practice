
public class Comida {
    public boolean ready;
    public String comida;
    public String postre;
    public String entrada;
    public String chef;

    public Comida(String chef) {
        this.chef = chef;
    }

    public String servir() {
        if(ready){
            return "La entrada " + entrada + "se sirvió. La comida " + comida + "se srivió." + "El postre " + postre + "se sirvió.";
        }
        else {
            return "La comida aun no está lista.";
        }
    }

    public Comida(String comida, String postre, String entrada, String chef) {
        this.comida = comida;
        this.postre = postre;
        this.entrada = entrada;
        this.chef = chef;
    }

    public boolean isReady() {
        return ready;
    }

    public String preparar() {
        this.ready = true;
        return "Se preparó la comida";
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public String getPostre() {
        return postre;
    }

    public void setPostre(String postre) {
        this.postre = postre;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }
}
