import interfaces.*;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class FacadeTest {
    MusicBand musicBand;
    PartyDecorations decorations;
    PartyDrinks drinks;
    PartyFood food;
    PartyInvitations invitations;
    PartyLights lights;
    PartySecurity security;
    PartyFacade partyFacade;

    @Before
    public void setUp(){
        partyFacade = new PartyFacade();
        partyFacade.hireServices();
    }

    @Test
    public void startParty(){
        Assert.assertEquals("Everything is up and running!", partyFacade.setUpPary());
    }

    @Test
    public void stopParty(){
        Assert.assertEquals("The party has ended!", partyFacade.takeDownPart());
    }
}
