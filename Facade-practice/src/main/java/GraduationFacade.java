public class GraduationFacade {

    private MusicBand musicBand;
    private Decoration decoration;
    private Drinks drinks;
    private Flowers flowers;
    private LightControl lightControl;
    private Waiter waiter;
    private Banquet banquet;

    public  GraduationFacade(MusicBand musicBand, Decoration decoration,
                             Drinks drinks, Flowers flowers, LightControl lightControl,
                             Waiter waiter, Banquet banquet){
        setMusicBand(musicBand);
        setDecoration(decoration);
        setDrinks(drinks);
        setFlowers(flowers);
        setLightControl(lightControl);
        setWaiter(waiter);
        setBanquet(banquet);
    }

    public MusicBand getMusicBand() {
        return musicBand;
    }

    public void setMusicBand(MusicBand musicBand) {
        this.musicBand = musicBand;
    }

    public Decoration getDecoration() {
        return decoration;
    }

    public void setDecoration(Decoration decoration) {
        this.decoration = decoration;
    }

    public Drinks getDrinks() {
        return drinks;
    }

    public void setDrinks(Drinks drinks) {
        this.drinks = drinks;
    }

    public Flowers getFlowers() {
        return flowers;
    }

    public void setFlowers(Flowers flowers) {
        this.flowers = flowers;
    }

    public LightControl getLightControl() {
        return lightControl;
    }

    public void setLightControl(LightControl lightControl) {
        this.lightControl = lightControl;
    }

    public Waiter getWaiter() {
        return waiter;
    }

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public Banquet getBanquet() {
        return banquet;
    }

    public void setBanquet(Banquet banquet) {
        this.banquet = banquet;
    }


    public void organiceGraduation(){
        flowers.prepareFlowers();
        decoration.prepareRoom();
        musicBand.setInstrument();
        lightControl.prepareLights();
        musicBand.calibrateSound();
        musicBand.testSound();
        lightControl.turnOnLights();
        banquet.prepareFood();
        musicBand.play();
        waiter.searchRaisedHand();
        drinks.fillDrinks();
    }
}
