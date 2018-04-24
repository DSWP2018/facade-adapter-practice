package com.ponchodevelops.com.ponchodevelops.facade_adapter;

import com.ponchodevelops.com.ponchodevelops.concreteclasses.*;
import com.ponchodevelops.com.ponchodevelops.concreteclasses.Long;
import com.ponchodevelops.interfaces.*;
import javafx.scene.shape.Circle;

public class GraduationFacade {

    private Dress long_green;
    private Drinks leon;
    private Food grandesito;

    private Lights some_lights;
    private MusicBand radiohead;
    private Suit smoking;

    private Tables family;

    public GraduationFacade() {
        long_green = new Long();
        leon = new Beer();
        grandesito = new TaquitoDePastor();
        some_lights = new Neon();
        radiohead = new Radiohead();
        smoking = new Suit();
        family = new Family();
    }

    public void wearLongGreenDress(){
        long_green.wear();
    }
    public void drinkLeonBeer(){
        leon.drink();
    }
    public void eatGrandesitoTaquitoDePastor(){
        grandesito.eat();
    }
    public void turnOnSomeNeonLights(){
        some_lights.turnOn();
    }
    public void turnOffSomeNeonLights(){
        some_lights.turnOff();
    }
    public void letRadioheadPlayCreep(){
        radiohead.playSong();
    }
    public void radioheadStopsPlayingCreep(){
        radiohead.stopPlaying();
    }
    public void wearSmokingSuit(){
        smoking.wear();
    }
    public void letGuestFamilyTableBeServed(){
        family.beServed();
        family.beServed();
    }



}
