package com.nrcg.ms_clinic.models;

public class Patient {

    public String id;
    public String firtname;
    public String lastname;
    public String gender;

    public Patient(String id, String firtname, String lastname, String gender) {
        this.id = id;
        this.firtname = firtname;
        this.lastname = lastname;
        this.gender = gender;
    }

    public String getId() {
        return id;
    }

    public String getFirtname() {
        return firtname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getGender() {
        return gender;
    }

}
