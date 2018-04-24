package objects;

import adapter.DJ;

public class TheDJ implements DJ {

    @Override
    public void setEquipment() {
        System.out.println("Dj setting the music equipment");
    }

    @Override
    public void calibrateMixTable() {
        System.out.println("Dj preparing the mix table");
    }

    @Override
    public void testSound() {
        System.out.println("Dj testing the sound");
    }

    @Override
    public void mix() {
        System.out.println("Dj mixing");
    }

}
