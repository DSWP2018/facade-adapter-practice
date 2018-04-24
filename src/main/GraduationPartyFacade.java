import components.*;
import components.music.MusicBand;

public class GraduationPartyFacade {
    private Banquet banquet;
    private Beverage beverage;
    private Decoration decoration;
    private Entertainment entertainment;
    private PartyRoom partyRoom;
    private TablesOrganization tablesOrganization;
    private MusicBand musicBand;

    public Banquet getBanquet() {
        return banquet;
    }

    public void setBanquet(Banquet banquet) {
        this.banquet = banquet;
    }

    public Beverage getBeverage() {
        return beverage;
    }

    public void setBeverage(Beverage beverage) {
        this.beverage = beverage;
    }

    public Decoration getDecoration() {
        return decoration;
    }

    public void setDecoration(Decoration decoration) {
        this.decoration = decoration;
    }

    public Entertainment getEntertainment() {
        return entertainment;
    }

    public void setEntertainment(Entertainment entertainment) {
        this.entertainment = entertainment;
    }

    public PartyRoom getPartyRoom() {
        return partyRoom;
    }

    public void setPartyRoom(PartyRoom partyRoom) {
        this.partyRoom = partyRoom;
    }

    public TablesOrganization getTablesOrganization() {
        return tablesOrganization;
    }

    public void setTablesOrganization(TablesOrganization tablesOrganization) {
        this.tablesOrganization = tablesOrganization;
    }

    public MusicBand getMusicBand() {
        return musicBand;
    }

    public void setMusicBand(MusicBand musicBand) {
        this.musicBand = musicBand;
    }

}
