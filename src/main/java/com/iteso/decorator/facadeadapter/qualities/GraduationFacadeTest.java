package com.iteso.decorator.facadeadapter.qualities;
import com.iteso.decorator.facadeadapter.qualities.adapter.DjAdapter;
import com.iteso.decorator.facadeadapter.qualities.impls.*;
import com.iteso.decorator.facadeadapter.qualities.interfaces.*;
import org.junit.Before;
import org.junit.Test;

public class GraduationFacadeTest {
    GraduationFacade facade;

    @Before
    public void setFacade() {
        facade = new GraduationFacade(new DjAdapter(new Avicii()), new Martini()
                ,new Pollo(), new Jose(), new LuzAzul(), new PistaBaile()
                ,new Salvacion());
    }

    @Test
    public void testOrganizeGraduation() {
        facade.organizeGraduation();
        assertTrue(true);
    }
