
public class FiestaFacade {
    Alcohol alcohol;
    InterfaceBanda banda;
    Comida comida;
    Decoracion decoracion;
    Lugar lugar;
    LuzSonido luz;
    Servicio servicio;

    public FiestaFacade(Alcohol alcohol, InterfaceBanda banda, Comida comida, Decoracion decoracion, Lugar lugar, LuzSonido luz, Servicio servicio) {
        this.alcohol = alcohol;
        this.banda = banda;
        this.comida = comida;
        this.decoracion = decoracion;
        this.lugar = lugar;
        this.luz = luz;
        this.servicio = servicio;
    }

    public Alcohol getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(Alcohol alcohol) {
        this.alcohol = alcohol;
    }


    public void setBanda(Banda banda) {
        this.banda = banda;
    }

    public Comida getComida() {
        return comida;
    }

    public void setComida(Comida comida) {
        this.comida = comida;
    }

    public Decoracion getDecoracion() {
        return decoracion;
    }

    public void setDecoracion(Decoracion decoracion) {
        this.decoracion = decoracion;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public LuzSonido getLuz() {
        return luz;
    }

    public void setLuz(LuzSonido luz) {
        this.luz = luz;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public String prepararFiesta() {
        return comida.preparar() + decoracion.decorar()
                + lugar.limpiar() + luz.ponerLuzSonido();
    }

    public String festejar() {
        return comida.servir() + alcohol.servir() +
            banda.play() + luz.prenderLuz() + servicio.aTrabajar();
    }

    public String terminar() {
        return banda.stop() + lugar.limpiar() + servicio.terminar() + luz.apagar();
    }
}
