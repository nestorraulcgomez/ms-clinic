package com.nrcg.ms_clinic.models;

import java.util.Date;

public class Attention {

    private int id;
    private String description;
    private Date date;

    public Attention(int id, String description, Date date) {
        this.id = id;
        this.description = description;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

}
