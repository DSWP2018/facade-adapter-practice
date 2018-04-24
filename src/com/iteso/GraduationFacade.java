package com.iteso;

import javafx.scene.effect.Light;

/**
 * El todo lo puede.
 */
public class GraduationFacade implements Band, Banquet, DanceFloor, Lights, Location, Service, Stereo, Vallet {

    Band band;
    Banquet banquet;
    DanceFloor danceFloor;
    Lights lights;
    Location location;
    Service service;
    Stereo stereo;
    Vallet vallet;

    public GraduationFacade(Band band, Banquet banquet, DanceFloor danceFloor,
                            Lights lights, Location location, Service service,
                            Stereo stereo, Vallet vallet) {
        this.band = band;
        this.banquet = banquet;
        this.danceFloor = danceFloor;
        this.lights = lights;
        this.location = location;
        this.service = service;
        this.stereo = stereo;
        this.vallet = vallet;
    }

    public void organizeGraduation() {

        System.out.println("Organizando");

        playSong("La cucaracha");
        stopPlaying();
        playBackgroundMusic();

        orderTable();
        serveSoup();
        serveMain();
        serveDessert();
        takeDishes();

        turnLightsOn();
        turnLightsOff();
        releaseSmoke();

        lightsOn();
        lightsOff();

        address();
        locationCost();

        serveDrinks();
        cleanUp();

        on();
        off();

        parkCar("Honda azul");
        retrieveCar("Chevy rojo");
    }


    @Override
    public void playSong(String songName) {
        System.out.println("Song playing : "+ songName);
    }

    @Override
    public void stopPlaying() {
        System.out.println("Stopped playing.");
    }

    @Override
    public void playBackgroundMusic() {
        System.out.println("Playing background music.");
    }

    @Override
    public void orderTable() {
        System.out.println("Placing dishes, cuttlery and cups");
    }

    @Override
    public void serveSoup() {
        System.out.println("Serving soup");
    }

    @Override
    public void serveMain() {
        System.out.println("Serving main dish");
    }

    @Override
    public void serveDessert() {
        System.out.println("Serving dessert");
    }

    @Override
    public void takeDishes() {
        System.out.println("Taking dirty dishes");
    }

    @Override
    public void turnLightsOn() {
        System.out.println("Turning dencefloor lights on");
    }

    @Override
    public void turnLightsOff() {
        System.out.println("Turning dancefloor lights off");
    }

    @Override
    public void releaseSmoke() {
        System.out.println("Released one charge of smoke");
    }

    @Override
    public void lightsOn() {
        System.out.println("Turned lights on");
    }

    @Override
    public void lightsOff() {
        System.out.println("Turned lights off");
    }

    @Override
    public void address() {
        System.out.println("Location is: Mariano Otero #5056");
    }

    @Override
    public void locationCost() {
        System.out.println("Cost is $10,000 per night");
    }

    @Override
    public void serveDrinks() {
        System.out.println("Serving wine");
    }

    @Override
    public void cleanUp() {
        System.out.println("Cleaning the floor");
    }

    @Override
    public void on() {
        System.out.println("Stereo is on");
    }

    @Override
    public void off() {
        System.out.println("Stereo is off");
    }

    @Override
    public void parkCar(String car) {
        System.out.println(car + " has been parked");
    }

    @Override
    public void retrieveCar(String car) {
        System.out.println(car + " has been returned");
    }
}
