package com.company;

public class FacadeGraduacion {

    private Music music;
    private Food food;
    private Place place;
    private Drink drink;
    private Organization organization;
    private Decor decor;

    public FacadeGraduacion(Music music, Food food, Place place, Drink drink, Organization org, Decor decor){
        this.music = music;
        this.food = food;
        this.place = place;
        this.drink = drink;
        organization = org;
        this.decor = decor;
    }

    public void StartParty(){
        music.prepare();
        music.play();
        food.serve();
        place.startTime();
        drink.serve();
        decor.turnOn();
        organization.start();
    }
}
