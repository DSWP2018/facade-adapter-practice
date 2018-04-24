package implementations;

import interfaces.Photos;

public class PhotoOrganize implements Photos {

    @Override
    public String hirePhotographer() {
        return "Photographer hired";
    }

    @Override
    public String makeAppointment() {
        return "Appointment made";
    }

    @Override
    public String setBackground() {
        return "Background set";
    }
}
