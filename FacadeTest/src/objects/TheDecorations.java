package objects;

import interfaces.Decorations;

public class TheDecorations implements Decorations {


    @Override
    public void decorate() {
        System.out.println("Decorating");
    }

}
