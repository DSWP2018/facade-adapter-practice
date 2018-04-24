public class GraduationPartyFacade {
    Decorations decorations;
    Dinner dinner;
    Drinks drinks;
    Furniture furniture;
    MusicBand musicBand;
    Venue venue;
    Waiters waiters;

    public GraduationPartyFacade(Decorations decorations, Dinner dinner, Drinks drinks, Furniture furniture, MusicBand musicBand, Venue venue, Waiters waiters) {
        this.decorations = decorations;
        this.dinner = dinner;
        this.drinks = drinks;
        this.furniture = furniture;
        this.musicBand = musicBand;
        this.venue = venue;
        this.waiters = waiters;
    }

    public void getEverythingReadyBeforeStarted(){
        venue.clean();
        venue.preparePlace();
        furniture.placeInSalon();
        decorations.hangUp();
    }

    public void startGrad(){
        musicBand.playSong();
        waiters.attendPeople();
    }

    public void startSrevingDinnerAndDrinks(){
        dinner.prepare();
        drinks.prepare();
        musicBand.takeABreak();
        dinner.serve();
        drinks.serve();
        waiters.serveTable();
    }

    public void playSomeMusicBand(){
        musicBand.playSong();
        musicBand.askWhereSingleLadiesAt();
    }
}
