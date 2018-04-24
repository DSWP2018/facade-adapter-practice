package com.iteso;

/**
 * parking.
 */
public interface Vallet {
    /**
     * estaciona el auto.
     * @param car modelo y color.
     */
    public void parkCar(String car);

    /**
     * devuelve el auto.
     * @param car modelo y color.
     */
    public void retrieveCar(String car);
}
