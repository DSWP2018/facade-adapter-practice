package com.fcamacho.fiestas;

import com.fcamacho.interfaces.*;

public class FiestaChafa implements TipoSonido, Mesa, Iglesia, Foto, Comida, Bebida, Adorno {
    @Override
    public void adornoTipo() {
        System.out.println("====== Adorno =====");
        System.out.println("Cubiertos estilo deshechable");
    }

    @Override
    public void adornoNombre() {
        System.out.println("Adorno de cubiertos");
    }

    @Override
    public void bebidaTipo() {
        System.out.println("====== Bebida =====");
        System.out.println("Agua");
    }

    @Override
    public void bebidaNombre() {
        System.out.println("Agua reciclada");
    }

    @Override
    public void comidaNombre() {
        System.out.println("====== Comida =====");
        System.out.println("Frijoles");
    }

    @Override
    public void comidaPrecio() {
        System.out.println("$100");
    }

    @Override
    public void fotografo() {
        System.out.println("====== Fotografia =====");
        System.out.println("Juan Perez Jr");
    }

    @Override
    public void precio() {
        System.out.println("$200");
    }

    @Override
    public void nombreIglesia() {
        System.out.println("====== Iglesia =====");
        System.out.println("Iglesia de madera");
    }

    @Override
    public void mesaNumero() {
        System.out.println("====== Mesa =====");
        System.out.println("320");
    }

    SonidoAdapter sonidoAdapter;
    @Override
    public void playMusic(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("Normal")){
            System.out.println("===== Sonido ====");
            System.out.println("Playing normal music. Name: " + fileName);
        } else {
            sonidoAdapter = new SonidoAdapter(audioType);
            sonidoAdapter.playMusic(audioType, fileName);
        }
    }
}
