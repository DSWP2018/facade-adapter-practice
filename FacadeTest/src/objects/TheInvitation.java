package objects;

import interfaces.Invitations;

public class TheInvitation implements Invitations {

    @Override
    public void sendInvitations() {
        System.out.println("Sending invitations");
    }

    @Override
    public void makeInvitations(int howMany) {
        System.out.println("Making " + howMany + " invitations");
    }
}
