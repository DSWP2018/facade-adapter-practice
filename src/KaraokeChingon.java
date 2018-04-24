public class KaraokeChingon implements Karaoke {
    @Override
    public void initialSetting(String playlist){
        System.out.println("Pluging in the karaoke");
        choosePlaylist(playlist);
    }
    @Override
    public void choosePlaylist(String playlist){
        System.out.println("Choosing playlist " + playlist);
    }
}
