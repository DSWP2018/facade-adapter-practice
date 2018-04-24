package com.company;

import com.company.implementations.*;

public class Main {

    public static void main(String[] args) {
	    Dj audien = new MyDj();
        DjAdapter musicBand = new DjAdapter(audien);

        Food pollo = new MyFood();
        Place traslomas = new MyPlace();
        Institution iteso = new MyInstitution();
        Drink cerveza = new MyDrink();
        Photographer alguien = new MyPhotographer();
        Light lucesMario = new MyLight();

        GraduationFacade graduationFacade = new GraduationFacade(musicBand, pollo, traslomas, iteso, cerveza, alguien, lucesMario);
        graduationFacade.startParty();
    }
}
