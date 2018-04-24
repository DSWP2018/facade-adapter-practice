import org.junit.Before;
import org.junit.Test;
import sun.text.normalizer.VersionInfo;

import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

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
        graduationFacade = new GraduationFacade(mockedMusicBand, mockedDecoration,
                mockedDrinks, mockedFlowers, mockedLightControl,
                mockedWaiter, mokedBanquet);
        //graduationFacade.setMusicBand(mockedMusicBand);
        graduationFacade.organiceGraduation();
        verify(graduationFacade.getBanquet(), atLeastOnce()).prepareFood();
        verify(graduationFacade.getDecoration(), atLeastOnce()).prepareRoom();
        verify(graduationFacade.getDrinks(), atLeastOnce()).fillDrinks();
        verify(graduationFacade.getFlowers(), atLeastOnce()).prepareFlowers();
        verify(graduationFacade.getLightControl(), atLeastOnce()).prepareLights();
        verify(graduationFacade.getLightControl(), atLeastOnce()).turnOnLights();
        verify(graduationFacade.getWaiter(), atLeastOnce()).searchRaisedHand();
        verify(graduationFacade.getMusicBand(), atLeastOnce()).setInstrument();
        verify(graduationFacade.getMusicBand(), atLeastOnce()).calibrateSound();
        verify(graduationFacade.getMusicBand(), atLeastOnce()).testSound();
        verify(graduationFacade.getMusicBand(), atLeastOnce()).play();
    }

    @Test
    public void organizeGraduationwithDJ(){
        graduationFacade.setMusicBand(djAdapter);
        graduationFacade.organiceGraduation();
        verify(graduationFacade, atLeastOnce()).getBanquet().prepareFood();

    }
}
