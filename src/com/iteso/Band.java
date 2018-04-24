package com.iteso;

/**
 * Banda en vivo.
 */
public interface Band {

    /**
     * Poner una cnación.
     * @param songName canción a tocar.
     */
    public void playSong(String songName);

    /**
     * detener canción.
     */
    public void stopPlaying();

    /**
     * poner canción sin letra.
     */
    public void playBackgroundMusic();

}
