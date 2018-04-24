

/**
 * Benefits Decorator.
 */
public class Alcohol {

    /**
     * tequila
     */
    int tequila;
    int vodka;
    int ron;
    int whiskey;


    public Alcohol(int tequila, int vodka, int ron, int whiskey) {
        this.tequila = tequila;
        this.vodka = vodka;
        this.ron = ron;
        this.whiskey = whiskey;
    }

    public String servir() {
        return "Se sirvió " + tequila
                + "botellas de tequila, "
                + vodka + "de vodka, "
                + ron + "de ron y "
                + whiskey + "de whiskey.";
    }

    public int getTequila() {
        return tequila;
    }

    public void setTequila(int tequila) {
        this.tequila = tequila;
    }

    public int getVodka() {
        return vodka;
    }

    public void setVodka(int vodka) {
        this.vodka = vodka;
    }

    public int getRon() {
        return ron;
    }

    public void setRon(int ron) {
        this.ron = ron;
    }

    public int getWhiskey() {
        return whiskey;
    }

    public void setWhiskey(int whiskey) {
        this.whiskey = whiskey;
    }
}
