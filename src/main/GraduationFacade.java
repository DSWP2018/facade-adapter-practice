import implementations.*;

public class GraduationFacade {
    Decorate decorate;
    Dine dine;
    Invite invite;
    MassOrganize massOrganize;
    MusicBandOrganize musicBandOrganize;
    PhotoOrganize photoOrganize;
    TableOrganize tableOrganize;

    public Decorate getDecorate() {
        return decorate;
    }

    public void setDecorate(Decorate decorate) {
        this.decorate = decorate;
    }

    public Dine getDine() {
        return dine;
    }

    public void setDine(Dine dine) {
        this.dine = dine;
    }

    public Invite getInvite() {
        return invite;
    }

    public void setInvite(Invite invite) {
        this.invite = invite;
    }

    public MassOrganize getMassOrganize() {
        return massOrganize;
    }

    public void setMassOrganize(MassOrganize massOrganize) {
        this.massOrganize = massOrganize;
    }

    public MusicBandOrganize getMusicBandOrganize() {
        return musicBandOrganize;
    }

    public void setMusicBandOrganize(MusicBandOrganize musicBandOrganize) {
        this.musicBandOrganize = musicBandOrganize;
    }

    public PhotoOrganize getPhotoOrganize() {
        return photoOrganize;
    }

    public void setPhotoOrganize(PhotoOrganize photoOrganize) {
        this.photoOrganize = photoOrganize;
    }

    public TableOrganize getTableOrganize() {
        return tableOrganize;
    }

    public void setTableOrganize(TableOrganize tableOrganize) {
        this.tableOrganize = tableOrganize;
    }

    public GraduationFacade(Decorate decorate1,
                            Dine dine1,
                            Invite invite1,
                            MassOrganize massOrganize1,
                            MusicBandOrganize musicBandOrganize1,
                            PhotoOrganize photoOrganize1,
                            TableOrganize tableOrganize1){
        decorate = decorate1;
        dine = dine1;
        invite = invite1;
        massOrganize = massOrganize1;
        musicBandOrganize = musicBandOrganize1;
        photoOrganize = photoOrganize1;
        tableOrganize = tableOrganize1;
    }
}
