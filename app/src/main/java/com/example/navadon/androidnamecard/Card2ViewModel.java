package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class Card2ViewModel extends ViewModel {
    private String fname;
    private String lname;
    private String position;
    private String email;
    private String phone;

    public Card2ViewModel() {
        this.fname = "";
        this.lname = "";
        this.position = "";
        this.email = "";
        this.phone = "";
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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhone(String phone) {
        this.phone = phone;
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

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }
}
