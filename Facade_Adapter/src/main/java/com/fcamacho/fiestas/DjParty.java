package com.fcamacho.fiestas;

import com.fcamacho.interfaces.Sonido;
import com.fcamacho.interfaces.TipoSonido;

public class DjParty implements Sonido {

    @Override
    public void bandaName() {
        System.out.println("DJ party");
    }

    @Override
    public void bandaPrecio() {
        System.out.println("$5000");
    }

    @Override
    public void setInstrument() {
        System.out.println("Disco DJ");
    }
}
