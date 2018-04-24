import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;

public class GraduationFacadeTest {

    private GraduationFacade graduationFacade;
    private Banquet mokedBanquet;
    private Decoration mockedDecoration;
    private Drinks mockedDrinks;
    private Flowers mockedFlowers;
    private LightControl mockedLightControl;
    private Waiter mockedWaiter;
    private MusicBand mockedMusicBand;
    private DjAdapter djAdapter;

    @Before
    public void setUp(){
    mokedBanquet = mock(Banquet.class);
    mockedDecoration = mock(Decoration.class);
    mockedDrinks = mock(Drinks.class);
    mockedFlowers = mock(Flowers.class);
    mockedLightControl = mock(LightControl.class);
    mockedWaiter = mock(Waiter.class);
    mockedMusicBand = mock(MusicBand.class);
    djAdapter = new DjAdapter();
    djAdapter.setDj(mock(DJ.class));
    }

    @Test
    public void organizeSetUpTestwithMusicBand(){
        graduationFacade.setMusicBand(mockedMusicBand);
        graduationFacade.organiceGraduation();
    }

    public void organizeGraduationwithDJ(){
        graduationFacade.setMusicBand(djAdapter);

    }
}
