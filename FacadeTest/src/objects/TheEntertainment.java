package objects;

import interfaces.Entertainment;

public class TheEntertainment implements Entertainment {
    @Override
    public void beginShow() {
        System.out.println("Show is starting");
    }
}
