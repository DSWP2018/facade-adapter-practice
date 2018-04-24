package com.iteso.decorator.facadeadapter.qualities;

import com.iteso.decorator.facadeadapter.qualities.interfaces.*;

public class GraduationFacade {
    private MusicBand musicBand;
    private Food food;
    private Drinks drinks;
    private Invitations invitations;
    private Lighting lighting;
    private Mass mass;
    private Dancefloor dancefloor;

    public GraduationFacade(MusicBand musicBand, Food food, Drinks drinks, Invitations invitations, Lighting lighting, Mass mass, Dancefloor dancefloor) {
        this.musicBand = musicBand;
        this.food = food;
        this.drinks = drinks;
        this.invitations = invitations;
        this.lighting = lighting;
        this.mass = mass;
        this.dancefloor = dancefloor;
    }

    public void organizeGraduation() {
        System.out.println(food);
        System.out.println(drinks);
        System.out.println(invitations);
        System.out.println(lighting);
        System.out.println(mass);
        System.out.println(dancefloor);
        musicBand.play();
    }
}
