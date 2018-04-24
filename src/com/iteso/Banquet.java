package com.iteso;

/**
 * Comida.
 */
public interface Banquet {

    /**
     * poner platos.
     */
    public void orderTable();
    /**
     * Servir sopa.
     */
    public void serveSoup();

    /**
     * servir guisado.
     */
    public void serveMain();

    /**
     * servir postre.
     */
    public void serveDessert();

    /**
     * recoger platos.
     */
    public void takeDishes();
}
