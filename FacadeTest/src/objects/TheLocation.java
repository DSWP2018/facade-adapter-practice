package objects;

import interfaces.Location;

public class TheLocation implements Location {
    @Override
    public void assignLocation(String location) {
        System.out.println("The graduation will be at " + location);
    }
}
