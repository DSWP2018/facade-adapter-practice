package facade;

import adapter.DJAdapter;
import objects.*;

public class GraduationFacade {

    public GraduationFacade() {

        organizeGraduation();

    }

    private static void organizeGraduation() {

        TheLocation location = new TheLocation();
        location.assignLocation("algun lado");


        TheInvitation invitation = new TheInvitation();
        invitation.makeInvitations(30);
        invitation.sendInvitations();


        TheDecorations decorations = new TheDecorations();
        decorations.decorate();


        /*DJAdapter music = new DJAdapter(new TheDJ());
        music.setInstruments();
        music.calibrateSound();
        music.testSound();
        music.play();*/


        TheDrinks drinks = new TheDrinks();
        drinks.assignDrink("Tequila");
        drinks.prepareDrinks();
        drinks.serveDrinks();


        TheEntertainment entertainment = new TheEntertainment();
        entertainment.beginShow();


        TheFood food = new TheFood();
        food.assignMeal("platillo");
        food.prepareMeals();
        food.serveMeal();

    }

}
