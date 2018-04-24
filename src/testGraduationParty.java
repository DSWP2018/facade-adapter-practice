public class testGraduationParty {

    public static void main(String... args){
        GraduationFacade party = new GraduationFacade();

        Decoration decoration = new Decoration() {
            @Override
            public void setOrnaments() {
                System.out.println("setOrnaments");
            }

            @Override
            public void setColor() {
                System.out.println("setColor");
            }

            @Override
            public void decorate() {
                System.out.println("decorating party");
            }
        };

        Drinks drinks = new Drinks() {
            @Override
            public void setDrink() {
                System.out.println("setDrink");
            }

            @Override
            public void prepareDrink() {
                System.out.println("prepareDrink");
            }

            @Override
            public void serveDrink() {
                System.out.println("serving drinks");
            }
        };

        Food food = new Food() {
            @Override
            public void setFood() {
                System.out.println("setFood");
            }

            @Override
            public void preparePlate() {
                System.out.println("preparePlate");
            }

            @Override
            public void serveFood() {
                System.out.println("serving food");
            }
        };

        Invitations invitations = new Invitations() {
            @Override
            public void designInvitation() {
                System.out.println("designInvitation");
            }

            @Override
            public void makeInvitation() {
                System.out.println("makeInvitation");
            }

            @Override
            public void sendInvitations() {
                System.out.println("sending invitations");
            }
        };

        Lights lights = new Lights() {
            @Override
            public void setColor() {
                System.out.println("setColor");
            }

            @Override
            public void setIntensity() {
                System.out.println("setIntensity");
            }

            @Override
            public void turnOn() {
                System.out.println("turn On the lights, babe");
            }

            @Override
            public void turnOff() {

            }
        };

        DJ dj = new DJ() {
            @Override
            public void connectComputer() {
                System.out.println("connectComputer");
            }

            @Override
            public void connectMixTable() {
                System.out.println("connectMixTable");
            }

            @Override
            public void calibrateSound() {
                System.out.println("calibrateSound");
            }

            @Override
            public void checkSound() {
                System.out.println("checkSound");
            }

            @Override
            public void mix() {
                System.out.println("mix punchis punchis");
            }

            @Override
            public void stop() {
                System.out.println("stop");
            }
        };

        Organization organization = new Organization() {
            @Override
            public void setTableArrangement() {
                System.out.println("setTableArrangement");
            }

            @Override
            public void setGuestArrangement() {
                System.out.println("setGuestArrangement");
            }

            @Override
            public void setFoodSchedule() {
                System.out.println("setFoodSchedule");
            }

            @Override
            public void rentEventHall() {
                System.out.println("rentEventHall");
            }

            @Override
            public void start() {
                System.out.println("start organization");
            }
        };



        party.setDecoration(decoration);
        party.setDrinks(drinks);
        party.setFood(food);
        party.setInvitations(invitations);
        party.setLights(lights);
        party.setMusicBand(new DJAdapter(dj));
        party.setOrganization(organization);
        party.StartParty();
    }


}
