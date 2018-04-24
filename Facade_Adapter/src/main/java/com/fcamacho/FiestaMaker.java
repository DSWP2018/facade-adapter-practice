package com.fcamacho;

import com.fcamacho.fiestas.FiestaChafa;
import com.fcamacho.fiestas.FiestaNormal;
import com.fcamacho.fiestas.FiestaPro;

public class FiestaMaker {
    private FiestaChafa fiestaChafa;
    private FiestaNormal fiestaNormal;
    private FiestaPro fiestaPro;

    public FiestaMaker() {
        fiestaChafa = new FiestaChafa();
        fiestaNormal = new FiestaNormal();
        fiestaPro = new FiestaPro();
    }
    //chafa
    public void showFiestaChafa() {
        fiestaChafa.adornoNombre();
        fiestaChafa.adornoTipo();
        /*fiestaChafa.bandaName();
        fiestaChafa.bandaPrecio();*/
        fiestaChafa.bebidaNombre();
        fiestaChafa.bebidaTipo();
        fiestaChafa.comidaNombre();
        fiestaChafa.comidaPrecio();
        fiestaChafa.fotografo();
        fiestaChafa.mesaNumero();
        fiestaChafa.nombreIglesia();
        fiestaChafa.precio();
        fiestaChafa.playMusic("Normal","party playlist");

    }
    //normal
    public void showFiestaNormal() {
        fiestaNormal.adornoNombre();
        fiestaNormal.adornoTipo();
        fiestaNormal.bandaName();
        fiestaNormal.bandaPrecio();
        fiestaNormal.bebidaNombre();
        fiestaNormal.bebidaTipo();
        fiestaNormal.comidaNombre();
        fiestaNormal.comidaPrecio();
        fiestaNormal.fotografo();
        fiestaNormal.mesaNumero();
        fiestaNormal.nombreIglesia();
        fiestaNormal.precio();
        fiestaNormal.setInstrument();
        fiestaChafa.playMusic("Normal","party playlist");
    }
    //pro
    public void showFiestaPro() {
        fiestaPro.adornoNombre();
        fiestaPro.adornoTipo();
        fiestaPro.bandaName();
        fiestaPro.bandaPrecio();
        fiestaPro.bebidaNombre();
        fiestaPro.bebidaTipo();
        fiestaPro.comidaNombre();
        fiestaPro.comidaPrecio();
        fiestaPro.fotografo();
        fiestaPro.mesaNumero();
        fiestaPro.nombreIglesia();
        fiestaPro.precio();
        fiestaPro.setInstrument();
        fiestaChafa.playMusic("DJ","super party pro playlist");
    }
}
