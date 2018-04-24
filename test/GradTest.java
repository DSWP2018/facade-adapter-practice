import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;

public class GradTest {

    Decoration decoration;
    Dinner dinner;
    Furniture furniture;
    Invitation invitation;
    MusicBand musicband;
    Souvenir souvenir;
    Venue venue;
    GraduationPartyFacade facade;

    @Before
    public void setUp(){
        decoration = new CentroDeMesa();
        dinner = new Cena3Tiempos();
        furniture = new MesaCuadrada();
        invitation = new Invitacion4Boletos();
        musicband = new DJtoMusicBandAdapter();
        souvenir = new Pantuflas();
        venue = new Benavento();
        facade = new GraduationPartyFacade(decoration, dinner, furniture, invitation, musicband, souvenir, venue);
    }

    @Test
    public void prepareParty(){
        Assert.assertEquals("Decoration has been selected", decoration.selectDecoration());
        Assert.assertEquals("Furniture has been selected", furniture.selectFurniture());
        Assert.assertEquals("Making invitations", invitation.makeInvitations());
        Assert.assertEquals("Invitations have been sent to all students", invitation.sendInvitations());
        Assert.assertEquals("Making souvenirs for the party", souvenir.makeSouvenirs());
        Assert.assertEquals("Venue has been selected for the graduation party", venue.selectVenue());
        Assert.assertEquals("Venue has been paid", venue.payVenue());
    }

    @Test
    public void beforeParty(){
        Assert.assertEquals("Setting selected decoration in venue", decoration.setDecoration());
        Assert.assertEquals("Preparing dinner", dinner.prepareDinner());
        Assert.assertEquals("Furnishing venue", furniture.furnishVenue());
        Assert.assertEquals("I'm a DJ, I don't do this things", musicband.calibrateSound());
        Assert.assertEquals("Bitch please, I'm a DJ, I just need a mixtable", musicband.setInstruments());
        Assert.assertEquals("Testing sound", musicband.testSound());

    }

    @Test
    public void duringParty(){
        Assert.assertEquals("Serving dinner", dinner.serveDinner());
        Assert.assertEquals("Mixing music to make people happy, Playing music", musicband.play());
        Assert.assertEquals("Giving the souvenirs to all people still in the party", souvenir.giveSouvenirs());
    }

}
