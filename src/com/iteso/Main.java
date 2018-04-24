package com.iteso;

public class Main {
    public static void main(String [] args){
        Band bandaEquis = new Band() {
            @Override
            public void playSong(String songName) {

            }

            @Override
            public void stopPlaying() {

            }

            @Override
            public void playBackgroundMusic() {

            }
        };
        Banquet tacosElFeo = new Banquet() {
            @Override
            public void orderTable() {

            }

            @Override
            public void serveSoup() {

            }

            @Override
            public void serveMain() {

            }

            @Override
            public void serveDessert() {

            }

            @Override
            public void takeDishes() {

            }
        };
        DanceFloor piso = new DanceFloor() {
            @Override
            public void turnLightsOn() {

            }

            @Override
            public void turnLightsOff() {

            }

            @Override
            public void releaseSmoke() {

            }
        };
        Lights illuma = new Lights() {
            @Override
            public void lightsOn() {

            }

            @Override
            public void lightsOff() {

            }
        };
        Location generic = new Location() {
            @Override
            public void address() {

            }

            @Override
            public void locationCost() {

            }
        };
        Service pesimo = new Service() {
            @Override
            public void serveDrinks() {

            }

            @Override
            public void cleanUp() {

            }
        };
        Stereo surround = new Stereo() {
            @Override
            public void on() {

            }

            @Override
            public void off() {

            }
        };
        Vallet ballet = new Vallet() {
            @Override
            public void parkCar(String car) {

            }

            @Override
            public void retrieveCar(String car) {

            }
        };

    /*    DJ dj = new DJ() {
            @Override
            public void remixSong(String songName) {

            }

            @Override
            public void lowerVolume() {

            }

            @Override
            public void playLoop() {

            }
        };*/
        DJAdapter djAdapter = new DJAdapter();



        GraduationFacade graduationFacade = new GraduationFacade(
                djAdapter, tacosElFeo, piso, illuma, generic, pesimo, surround, ballet);

        graduationFacade.organizeGraduation();


    }


}
