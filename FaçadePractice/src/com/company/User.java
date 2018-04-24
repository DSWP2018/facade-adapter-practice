package com.company;

public class User {

    public static void main(String[] args) {
        FacadeGraduacion grad = new FacadeGraduacion(
                new DJAdapter(new DJAvici()),
                new Garibaldi(),
                new Expo(),
                new HennesyCO(),
                new ISC(),
                new ElBroncoPosadas()
        );

        grad.StartParty();
    }
}
