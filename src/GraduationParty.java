public class GraduationParty {
    public void StartParty(){
        Drinks drinks = new PerlaNegra();
        Food food = new TaquitosOfPastor();
        Lights lights = new PartyLights();
        SoundEquipment sound = new SoundEquipmentKomodo3000();
        Karaoke karaoke = new KaraokeChingon();
        Microphone micro = new Micro3000();
        Band band = new DJAdapter(new Avicii());

        drinks.prepare();
        food.setupFood();
        lights.turnOn();
        sound.setUp();
        karaoke.initialSetting("Valentin Elizalde");
        micro.turnOn();
        band.setInstruments();
        band.calibrateSound();
        band.testInstruments();
        band.startPlaying();
    }
}
