package src;

public class MartinGarrix implements DJ {
    @Override
    public String connectEquipment() {
        return "Equipo listo";
    }

    @Override
    public String askIfYouAreReadyToParty() {
        return "ARE YOU READY TO PARTAAYYYY";
    }

    @Override
    public String play() {
        return "Martin Garrix está tocando";
    }
}
