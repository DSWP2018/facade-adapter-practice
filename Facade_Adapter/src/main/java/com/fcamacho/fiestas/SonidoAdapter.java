package com.fcamacho.fiestas;

import com.fcamacho.interfaces.Sonido;
import com.fcamacho.interfaces.TipoSonido;

public class SonidoAdapter implements TipoSonido {
    Sonido sonido;
    public SonidoAdapter(String audioType) {
        if (audioType.equalsIgnoreCase("DJ")) {
            System.out.println("====== Sonido =====");
            sonido = new DjParty();
        }
    }
    @Override
    public void playMusic(String audioType, String fileName) {
        System.out.println("Playing: "+audioType);
        System.out.println("Playlist: "+fileName);
    }
}
