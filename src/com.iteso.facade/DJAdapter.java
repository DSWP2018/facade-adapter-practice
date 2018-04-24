public class DJAdapter implements InterfaceBanda {
    DJ dj;

    public DJAdapter(DJ dj) {
        this.dj = dj;
    }

    @Override
    public String play() {
        return dj.conectarse() + dj.play() + dj.cambioDeHumor();
    }

    @Override
    public String stop() {
        return dj.stop();
    }

    @Override
    public String breakTime() {
        return dj.cambioDeHumor() + dj.breakTime();
    }

    @Override
    public String getStatus() {
        return dj.getStatus();
    }
}
