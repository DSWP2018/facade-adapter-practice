package com.fcamacho.fiestas;

import com.fcamacho.interfaces.*;

public class FiestaNormal implements Sonido, Mesa, Iglesia, Foto, Comida, Bebida, Adorno {

    @Override
    public void adornoTipo() {
        System.out.println("====== Adorno =====");
        System.out.println("Luces estilo disco");
    }

    @Override
    public void adornoNombre() {
        System.out.println("Adorno de luces");
    }

    @Override
    public void bebidaTipo() {
        System.out.println("====== Bebida =====");
        System.out.println("Alcohol");
    }

    @Override
    public void bebidaNombre() {
        System.out.println("Vino tinto");
    }

    @Override
    public void comidaNombre() {
        System.out.println("====== Comida =====");
        System.out.println("Tortas de tamal");
    }

    @Override
    public void comidaPrecio() {
        System.out.println("$7,000");
    }

    @Override
    public void fotografo() {
        System.out.println("====== Fotografia =====");
        System.out.println("Juan Perez");
    }

    @Override
    public void precio() {
        System.out.println("$5,000");
    }

    @Override
    public void nombreIglesia() {
        System.out.println("====== Iglesia =====");
        System.out.println("Iglesia de La esquina");
    }

    @Override
    public void mesaNumero() {
        System.out.println("====== Mesa =====");
        System.out.println("120");
    }

    @Override
    public void bandaName() {
        System.out.println("====== Banda =====");
        System.out.println("Cafe Tacvba");
    }

    @Override
    public void bandaPrecio() {
        System.out.println("$50,000");
    }

    @Override
    public void setInstrument() {
        System.out.println("Trompeta");
        System.out.println("Guitarra");
        System.out.println("Violin");
        System.out.println("Arpa");
    }
}
