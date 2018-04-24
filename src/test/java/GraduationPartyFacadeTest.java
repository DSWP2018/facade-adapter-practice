import components.*;
import components.music.DJ;
import components.music.DJAdapter;
import components.music.MusicBand;
import org.junit.Before;
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
        djAdapter = new DJAdapter();
        dj = mock(DJ.class);
        musicBand = mock(MusicBand.class);
        banquet = mock(Banquet.class);
        beverage = mock(Beverage.class);
        decoration = mock(Decoration.class);
        entertainment = mock(Entertainment.class);
        partyRoom = mock(PartyRoom.class);
        tablesOrganization = mock(TablesOrganization.class);
    }

    public 




}
