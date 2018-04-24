
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import src.*;

import java.lang.management.MemoryUsage;

public class GradTest {
   private GraduationParty graduationParty;
   private MusicBand dj;
   Mesas furniture;
   Bebidas drinks;
   Cena dinner;
   Decoraciones decoraciones;
   Meseros waiters;
   Lugar venue;


@Before
    public void SetUp(){
    dj = new DJAdapter();
    furniture = new Mesas();
    drinks = new Bebidas();
    dinner = new Cena();
    decoraciones = new Decoraciones();
    waiters = new Meseros();
    venue = new Lugar();
    graduationParty = new GraduationParty(dj, furniture, drinks,dinner,
            decoraciones,waiters,venue);
    }

    @Test
    public void startParty(){
   graduationParty.startTheParty();
    Assert.assertEquals("ARE YOU READY TO PARTAAYYYY", dj.askWhereSingleLadiesAre());
    Assert.assertEquals("Martin Garrix está tocando", dj.play());
    Assert.assertEquals("Equipo listo", dj.setInstruments());
    }
}
