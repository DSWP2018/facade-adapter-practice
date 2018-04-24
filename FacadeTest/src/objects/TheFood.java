package objects;

import interfaces.Food;

public class TheFood implements Food {

    private String meal;

    @Override
    public void assignMeal(String meal) {
        this.meal = meal;
    }

    @Override
    public void prepareMeals() {
        System.out.println("Preparing " + meal);
    }

    @Override
    public void serveMeal() {
        System.out.println("serving " + meal);
    }
}
