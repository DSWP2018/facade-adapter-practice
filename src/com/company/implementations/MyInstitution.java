package com.company.implementations;

import com.company.Institution;

public class MyInstitution implements Institution {
    @Override
    public void getGuestsList() {
        System.out.println("Showing guests list");
    }
}
