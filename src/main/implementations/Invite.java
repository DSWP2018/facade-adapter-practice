package implementations;

import interfaces.Invitations;

public class Invite implements Invitations {
    @Override
    public String confirmInvitationPrinter() {
        return "Invitation printer confirmed";
    }

    @Override
    public String sendInvitationDesign() {
        return "Design invitations";
    }

    @Override
    public String printInvitations() {
        return "Invitations printed";
    }

    @Override
    public String sendInvitations() {
        return "Invitations sent";
    }
}
