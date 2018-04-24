import adapters.DJAdapter;
import implementations.*;
import interfaces.*;

public class PartyFacade {
    MusicBand musicBand;
    PartyDecorations decorations;
    PartyDrinks drinks;
    PartyFood food;
    PartyInvitations invitations;
    PartyLights lights;
    PartySecurity security;

    public void hireServices(){
        musicBand = new DJAdapter();
        decorations = new ToscanoDecorations();
        drinks = new ToscanoDrinks();
        food = new ToscanoFood();
        invitations = new ToscanoInvitations();
        lights = new ToscanoLights();
        security = new ToscanoSecurity();
    }

    public String setUpPary(){
        return (musicBand.setUp() &
                decorations.setUp() &
                drinks.setUp() &
                food.setUp() &
                invitations.setUp() &
                lights.setUp() &
                security.setUp() ?
                "Everything is up and running!" :
                "Something went wrong!");
    }

    public String takeDownPart(){
        return (!(musicBand.takeDown() &
                decorations.takeDown() &
                drinks.takeDown() &
                food.takeDown() &
                invitations.takeDown() &
                lights.takeDown() &
                security.takeDown()) ?
                "The party has ended!" :
                "This party just can't stooop!");
    }
}
