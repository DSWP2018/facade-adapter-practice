package com.iteso.decorator.facadeadapter.qualities.impls;

import com.iteso.decorator.facadeadapter.qualities.interfaces.Invitations;
import com.iteso.decorator.facadeadapter.qualities.interfaces.Mass;

public class Salvacion implements Mass {
    @Override public String toString() {
        return "La misa sera en la iglesia de la salvación";
    }

    @Override
    public void insertGuest(Invitations guest) {

    }
}