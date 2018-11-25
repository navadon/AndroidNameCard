package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class InformationViewModel extends ViewModel {

    private String firstname;
    private String lastname;
    private String job_position;
    private String click_information;
    private String email;
    private String mobile;
    private String website;

    public String getClick_main() {
        return click_main;
    }

    public void setClick_main(String click_main) {
        this.click_main = click_main;
    }

    private String click_main;

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

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getEmail() {

        return email;
    }

    public String getMobile() {
        return mobile;
    }

    public String getWebsite() {
        return website;
    }

    public InformationViewModel(){
        this.firstname = "Chaloempong";
        this.lastname = "Budkrajang";
        this.job_position = "Web Developer / Android Developer";
        this.click_information = "Click here for more information";
        this.email = "chaloempongXX@gmail.com";
        this.mobile = "063-446XXXX";
        this.website = "www.commee.me";
        this.click_main = "Click here for back to main";
    }


}
