import implementations.*;
import interfaces.DJAdapter;
import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

public class GraduationFacadeTesting {
    GraduationFacade graduationFacade;
    Decorate decorate;
    Dine dine;
    Invite invite;
    MassOrganize massOrganize;
    MusicBandOrganize musicBandOrganize;
    PhotoOrganize photoOrganize;
    TableOrganize tableOrganize;
    DjOrganize djOrganize;
    DJAdapter djAdapter;

    @Before
    public void setup(){
        decorate = new Decorate();
        dine = new Dine();
        invite = new Invite();
        massOrganize = new MassOrganize();
        musicBandOrganize = new MusicBandOrganize();
        photoOrganize = new PhotoOrganize();
        tableOrganize = new TableOrganize();
        djOrganize = new DjOrganize();
        djAdapter = new DJAdapter(djOrganize);
        graduationFacade = new GraduationFacade(decorate, dine, invite, massOrganize, musicBandOrganize, photoOrganize, tableOrganize);
    }
    @Test
    public void GraduationTesting(){
        Assert.assertEquals("Outside decoration set", graduationFacade.getDecorate().setOutsideDecoration());
        Assert.assertEquals("Inside decoration set", graduationFacade.getDecorate().setOutsideDecoration());
        Assert.assertEquals("Balloons set", graduationFacade.getDecorate().setOutsideDecoration());
        Assert.assertEquals("Lighting checked", graduationFacade.getDecorate().setOutsideDecoration());

        Assert.assertEquals("Chef confirmed", graduationFacade.getDine().confirmChef());
        Assert.assertEquals("Kitchen set", graduationFacade.getDine().setKitchen());

        Assert.assertEquals("Instruments set", graduationFacade.getMusicBandOrganize().setInstruments());
        Assert.assertEquals("Sound calibrated", graduationFacade.getMusicBandOrganize().calibrateSound());
        Assert.assertEquals("Sound tested", graduationFacade.getMusicBandOrganize().testSound());
        Assert.assertEquals("Music played", graduationFacade.getMusicBandOrganize().play());

        Assert.assertEquals("Invitation printer confirmed", graduationFacade.getInvite().confirmInvitationPrinter());
        Assert.assertEquals("Design invitations", graduationFacade.getInvite().sendInvitationDesign());
        Assert.assertEquals("Invitations printed", graduationFacade.getInvite().printInvitations());
        Assert.assertEquals("Invitations sent", graduationFacade.getInvite().sendInvitations());

        Assert.assertEquals("Priest confirmed", graduationFacade.getMassOrganize().confirmPriest());
        Assert.assertEquals("Speakers assigned", graduationFacade.getMassOrganize().setSpeakers());
        Assert.assertEquals("Volunteers set", graduationFacade.getMassOrganize().setVolunteers());
        Assert.assertEquals("Mass started", graduationFacade.getMassOrganize().startMass());

        Assert.assertEquals("Photographer hired", graduationFacade.getPhotoOrganize().hirePhotographer());
        Assert.assertEquals("Appointment made", graduationFacade.getPhotoOrganize().makeAppointment());
        Assert.assertEquals("Background set", graduationFacade.getPhotoOrganize().setBackground());

        Assert.assertEquals("Centerpiece se", graduationFacade.getTableOrganize());
        Assert.assertEquals("Cloth Napkins set", graduationFacade.getTableOrganize());
        Assert.assertEquals("Table Cloth set", graduationFacade.getTableOrganize());
    }
}