public class GraduationPartyFacade {
    Decorations decorations = new Globos();
    Dinner dinner = new PolloConCrema();
    Drinks drinks = new Margarita();
    Furniture furniture= new Mesa();
    MusicBand musicBand = new LosPunchis();
    Venue venue = new PlantaBaja();
    Waiters waiters = new WaiterMesa10();
    MusicBand dj = new DJAdapter();

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

    public void playSomeMusicDJ(){
        dj.playSong();
        dj.askWhereSingleLadiesAt();
    }
}
