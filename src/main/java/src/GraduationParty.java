package src;

public class GraduationParty {
MusicBand musicBand;
Furniture tables;
Drinks drinks;
Dinner dinner;
Decorations decorations;
Waiters waiters;
Venue venue;

public GraduationParty(MusicBand band, Furniture fur,
                       Drinks drink, Dinner dinner, Decoraciones decorations,
                       Waiters waiters, Venue venue){
    this.decorations = decorations;
    this.dinner = dinner;
    this.drinks = drink;
    this.musicBand = band;
    this.tables = fur;
    this.venue = venue;
    this.waiters = waiters;
}

public void getThePartyReady(){
    venue.rent();
    venue.clean();
    tables.place();
    musicBand.setInstruments();
    decorations.decorate();
}

public void startTheParty(){
    waiters.serveTable();
    drinks.prepare();
    dinner.prepare();

    musicBand.askWhereSingleLadiesAre();
}

public void serveDinner(){
    waiters.attendBar();
    waiters.attendCook();
    waiters.serveTable();
    dinner.serve();
    drinks.serve();
}


}
