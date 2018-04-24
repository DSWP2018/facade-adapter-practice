public class DJDavid implements DJ {
    int status;
    @Override
    public String conectarse() {
        return "Se conectó";
    }

    @Override
    public String cambioDeHumor() {
        return "Cambio de estilo de música";
    }

    @Override
    public String play() {
        status = 1;
        return "El dj está tocando";
    }

    @Override
    public String breakTime() {
        status = 2;
        return "El dj se tomó un descanso";
    }

    @Override
    public String stop() {
        status = 0;
        return "David se tiene que ir :(";
    }

    @Override
    public String getStatus() {
        if(status == 1) return "THE DJ IS PLAYING";
        if(status == 0) return "THE DJ IS NO PLAYING";
        if(status == 2) return "THE DJ IS ON BREAK";
        return "Error";
    }
}
