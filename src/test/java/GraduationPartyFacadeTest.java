import components.*;
import components.music.DJ;
import components.music.DJAdapter;
import components.music.MusicBand;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class GraduationPartyFacadeTest {
    @Mock
    DJ dj;
    DJAdapter djAdapter;
    MusicBand musicBand;
    Banquet banquet;
    Beverage beverage;
    Decoration decoration;
    Entertainment entertainment;
    PartyRoom partyRoom;
    TablesOrganization tablesOrganization;
    GraduationPartyFacade graduationPartyFacade;

    @Before
    public void setUp(){
        graduationPartyFacade = new GraduationPartyFacade();
        dj = mock(DJ.class);
        musicBand = mock(MusicBand.class);
        banquet = mock(Banquet.class);
        beverage = mock(Beverage.class);
        decoration = mock(Decoration.class);
        entertainment = mock(Entertainment.class);
        partyRoom = mock(PartyRoom.class);
        tablesOrganization = mock(TablesOrganization.class);

        graduationPartyFacade.setBanquet(banquet);
        graduationPartyFacade.setMusicBand(musicBand);
        graduationPartyFacade.setBeverage(beverage);
        graduationPartyFacade.setDecoration(decoration);
        graduationPartyFacade.setEntertainment(entertainment);
        graduationPartyFacade.setTablesOrganization(tablesOrganization);
        graduationPartyFacade.setPartyRoom(partyRoom);
    }

    @Test
    public void organizePartyTest(){
        doNothing().when(banquet).serveDessert();
        doNothing().when(musicBand).play();
        doNothing().when(beverage).serveDrink();
        doNothing().when(decoration).setDecoration();
        doNothing().when(tablesOrganization).organizeTables();
        doNothing().when(entertainment).playConmemorativeVideo();
        doNothing().when(partyRoom).setClosedRoom();

        Assert.assertEquals("Party organized", graduationPartyFacade.organizeParty());
        verify(graduationPartyFacade.getBanquet(), times(1)).serveDessert();
        verify(graduationPartyFacade.getPartyRoom(), times(1)).setClosedRoom();
        verify(graduationPartyFacade.getMusicBand(), times(1)).play();
        verify(graduationPartyFacade.getBeverage(), times(1)).serveDrink();
        verify(graduationPartyFacade.getEntertainment(), times(1)).playConmemorativeVideo();
        verify(graduationPartyFacade.getTablesOrganization(), times(1)).organizeTables();
        verify(graduationPartyFacade.getDecoration(), times(1)).setDecoration();
    }

    @Test
    public void djAdapterTest(){
        djAdapter = new DJAdapter(dj);
        doNothing().when(dj).connectEquipment();
        doNothing().when(dj).calibrateEquipment();
        doNothing().when(dj).checkSound();
        doNothing().when(dj).play();
        doNothing().when(dj).stop();

        musicBand = djAdapter;

        doNothing().when(banquet).serveDessert();
        //doNothing().when(musicBand).play();
        doNothing().when(beverage).serveDrink();
        doNothing().when(decoration).setDecoration();
        doNothing().when(tablesOrganization).organizeTables();
        doNothing().when(entertainment).playConmemorativeVideo();
        doNothing().when(partyRoom).setClosedRoom();

        Assert.assertEquals("Party organized", graduationPartyFacade.organizeParty());
        verify(graduationPartyFacade.getBanquet(), times(1)).serveDessert();
        verify(graduationPartyFacade.getPartyRoom(), times(1)).setClosedRoom();
        verify(graduationPartyFacade.getBeverage(), times(1)).serveDrink();
        verify(graduationPartyFacade.getEntertainment(), times(1)).playConmemorativeVideo();
        verify(graduationPartyFacade.getTablesOrganization(), times(1)).organizeTables();
        verify(graduationPartyFacade.getDecoration(), times(1)).setDecoration();

    }




}
