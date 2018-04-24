import mx.iteso.dsw.graduacion.GraduationFacade;
import mx.iteso.dsw.graduacion.adaptators.DJAdaptator;
import mx.iteso.dsw.graduacion.impl.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class GraduationFacadeTest {
    GraduationFacade gf;

    @Before
    public void setGf() {
        gf = new GraduationFacade(new DJAdaptator(new DJSonrisas()), new CucharasTenedoresCuchillos()
        ,new Terraza(), new MantelBlanco(), new MesasHipsters(), new SillasRusticas()
        ,new VajillaPorcelana());
    }

    @Test
    public void testOrganizeGraduation() {
        gf.organizeGraduation();
        assertTrue(true);
    }

    @Test
    public void testOrganizeGraduationWithBand() {
        gf = new GraduationFacade(new BandaElCuarteto(), new CucharasTenedoresCuchillos()
                ,new Terraza(), new MantelBlanco(), new MesasHipsters(), new SillasRusticas()
                ,new VajillaPorcelana());
        gf.organizeGraduation();
        assertTrue(true);
    }
}
