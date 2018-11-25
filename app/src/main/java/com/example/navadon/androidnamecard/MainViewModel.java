package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private String firstname;
    private String lastname;
    private String job_position;
    private String click_information;

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setJob_position(String job_position) {
        this.job_position = job_position;
    }

    public void setClick_information(String click_information) {
        this.click_information = click_information;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getJob_position() {
        return job_position;
    }

    public String getClick_information() {
        return click_information;
    }

    public MainViewModel(){
        this.firstname = "Chaloempong";
        this.lastname = "Budkrajang";
        this.job_position = "Web Developer / Android Developer";
        this.click_information = "Click here for more information";
    }


}
