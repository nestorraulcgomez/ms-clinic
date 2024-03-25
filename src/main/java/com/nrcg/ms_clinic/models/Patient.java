package com.nrcg.ms_clinic.models;

import java.util.List;

public class Patient {

    private int id;
    private String firtname;
    private String lastname;
    private String gender;
    private List<Attention> medicalRecord;

    public Patient(int id, String firtname, String lastname, String gender, List<Attention> medicalRecord) {
        this.id = id;
        this.firtname = firtname;
        this.lastname = lastname;
        this.gender = gender;
        this.medicalRecord = medicalRecord;
    }

    public int getId() {
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

    public List<Attention> getMedicalRecord() {
        return medicalRecord;
    }

}
