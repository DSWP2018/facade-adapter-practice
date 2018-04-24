package com.fcamacho.fiestas;

import com.fcamacho.interfaces.*;

public class FiestaPro implements Sonido, Mesa, Iglesia, Foto, Comida, Bebida, Adorno {

    @Override
    public void adornoTipo() {
        System.out.println("====== Adorno =====");
        System.out.println("Florero estilo frances super pro");
    }

    @Override
    public void adornoNombre() {
        System.out.println("Adorno de mesa");
    }

    @Override
    public void bebidaTipo() {
        System.out.println("====== Bebida =====");
        System.out.println("Alcohol");
    }

    @Override
    public void bebidaNombre() {
        System.out.println("Champagne Armand de Brignac Midas");
    }

    @Override
    public void comidaNombre() {
        System.out.println("====== Comida =====");
        System.out.println("Pozole rojo");
    }

    @Override
    public void comidaPrecio() {
        System.out.println("$70,000");
    }

    @Override
    public void fotografo() {
        System.out.println("====== Fotografia =====");
        System.out.println("Steve McCurry");
    }

    @Override
    public void precio() {
        System.out.println("$10,000");
    }

    @Override
    public void nombreIglesia() {
        System.out.println("====== Iglesia =====");
        System.out.println("Iglesia ITESO 2.0");
    }

    @Override
    public void mesaNumero() {
        System.out.println("====== Mesa =====");
        System.out.println("32");
    }

    @Override
    public void bandaName() {
        System.out.println("====== Banda =====");
        System.out.println("Bond");
    }

    @Override
    public void bandaPrecio() {
        System.out.println("$1,000,000");
    }

    @Override
    public void setInstrument() {
        System.out.println("Disco");
    }
}
