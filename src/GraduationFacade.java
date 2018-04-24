public class GraduationFacade {
    MusicBand musicBand;
    Decoration decoration;
    Drinks drinks;
    Food food;
    Invitations invitations;
    Lights lights;
    Organization organization;

    public void setMusicBand(MusicBand musicBand) {
        this.musicBand = musicBand;
    }

    public void setDecoration(Decoration decoration) {
        this.decoration = decoration;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    public void setFood(Food food) {
        this.food = food;
    }

    public void setInvitations(Invitations invitations) {
        this.invitations = invitations;
    }

    public void setLights(Lights lights) {
        this.lights = lights;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public void StartParty(){
        musicBand.play();
        decoration.decorate();
        food.serveFood();
        drinks.serveDrink();
        invitations.sendInvitations();
        lights.turnOn();
        organization.start();
    }
}
