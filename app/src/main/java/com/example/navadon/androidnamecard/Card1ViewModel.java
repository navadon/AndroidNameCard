package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class Card1ViewModel extends ViewModel {
    private String fname;
    private String lname;
    private String position;

    public Card1ViewModel() {
        this.fname = "";
        this.lname = "";
        this.position = "";
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getPosition() {
        return position;
    }
}
