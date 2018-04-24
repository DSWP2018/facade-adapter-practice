import mx.iteso.dsw.graduacion.GraduationFacade;
import mx.iteso.dsw.graduacion.adaptators.DJAdaptor;
import mx.iteso.dsw.graduacion.implement.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GraduationFacadeTest {
    GraduationFacade gf;

    @Before
    public void setGf() {
        gf = new GraduationFacade(new DJAdaptor(new DJ()), new Utencilios()
                ,new Terraza(), new Mantel(), new Mesas(), new Sillas()
                ,new Vajilla());
    }

    @Test
    public void testOrganizeGraduation() {
        gf.organizeGraduation();
        assertTrue(true);
    }

    @Test
    public void testOrganizeGraduationWithBand() {
        gf = new GraduationFacade(new Banda(), new Utencilios()
                ,new Terraza(), new Mantel(), new Mesas(), new Sillas()
                ,new Vajilla());
        gf.organizeGraduation();
        assertTrue(true);
    }
}