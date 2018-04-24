package objects;

import interfaces.Drinks;

public class TheDrinks implements Drinks {

    private String drinks;

    @Override
    public void assignDrink(String drinks) {
        this.drinks = drinks;
        System.out.println("assigning drink: " + drinks);
    }

    @Override
    public void prepareDrinks() {
        System.out.println("preparing " + drinks);
    }

    @Override
    public void serveDrinks() {
        System.out.println("serving " + drinks);
    }
}
