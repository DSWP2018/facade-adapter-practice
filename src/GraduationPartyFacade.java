public class GraduationPartyFacade {

    Decoration decoration;
    Dinner dinner;
    Furniture furniture;
    Invitation invitation;
    MusicBand musicband;
    Souvenir souvenir;
    Venue venue;

    public GraduationPartyFacade(Decoration decoration, Dinner dinner, Furniture furniture, Invitation invitation, MusicBand musicband, Souvenir souvenir, Venue venue) {
        this.decoration = decoration;
        this.dinner = dinner;
        this.furniture = furniture;
        this.invitation = invitation;
        this.musicband = musicband;
        this.souvenir = souvenir;
        this.venue = venue;
    }

    public void prepareParty(){
        decoration.selectDecoration();
        furniture.selectFurniture();
        invitation.makeInvitations();
        invitation.sendInvitations();
        souvenir.makeSouvenirs();
        venue.selectVenue();
        venue.payVenue();
    }

    public void beforeParty(){
        decoration.setDecoration();
        dinner.prepareDinner();
        furniture.furnishVenue();
        musicband.calibrateSound();
        musicband.setInstruments();
        musicband.testSound();
    }

    public void duringParty(){
        dinner.serveDinner();
        musicband.play();
        souvenir.giveSouvenirs();
    }

}
