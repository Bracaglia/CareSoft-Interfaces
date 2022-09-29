package com.caresoft.clinicapp;

import java.util.ArrayList;
import java.util.Date;

public class Physician extends User implements HIPAACompliantUser {
    //... imports class definition...

    // Inside class:
    private ArrayList<String> patientNotes = new ArrayList<>();

    public Physician(int id) {
        super(id);
    }

    // TO DO: Constructor that takes an ID
    // TO DO: Implement HIPAACompliantUser!

    public void newPatientNotes(String notes, String patientName, Date date) {
        String report = String.format(
                "Datetime Submitted: %s \n", date);
        report += String.format("Reported By ID: %s\n", this.id);
        report += String.format("Patient Name: %s\n", patientName);
        report += String.format("Notes: %s \n", notes);
        this.patientNotes.add(report);
    }

    @Override
    public boolean assignPin(int pin1) {
        //THIS IS WHERE YOU ADD YOUR CODE
        if(Integer.toString(pin1).length() == 4){
            pin = pin1;
            return true;
        } else {
        return false;
    }
    }

    @Override
    public boolean accessAuthorized(Integer confirmedAuthID) {
       //THIS IS WHERE YOU ADD YOUR CODE
        if(id == confirmedAuthID){
            return true;
        } else {
        return false;
    }
}
}
