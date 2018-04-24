package com.company;

public class GraduationFacade {
    private MusicBand musicBand;
    private Food food;
    private Place place;
    private Institution institution;
    private Drink drink;
    private Photographer photographer;
    private Light light;

    public GraduationFacade(MusicBand musicBand, Food food, Place place, Institution institution, Drink drink, Photographer photographer, Light light) {
        this.musicBand = musicBand;
        this.food = food;
        this.place = place;
        this.institution = institution;
        this.drink = drink;
        this.photographer = photographer;
        this.light = light;
    }

    public void startParty(){
        musicBand.setInstruments();
        musicBand.calibrateInstruments();
        musicBand.play();
        food.serveDishes();
        place.setGarden();
        institution.getGuestsList();
        drink.serveDrinks();
        photographer.takePhotos();
        light.turnOn();
    }
}
