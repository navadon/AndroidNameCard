package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class Model extends ViewModel {
    private String firstName;
    private String email;
    private String semail;
    private String bdate;
    private String sbdate;
    private String age;
    private String sage;
    private String phone;
    private String sphone;

    public Model(){
        this.firstName = "Phakin Chukiatkajohn";
        this.email = "Email : " ;
        this.semail = "Phakin_chu@gmail.com" ;
        this.bdate = "Birthday : ";
        this.sbdate = "25/5/1997";
        this.age = "Age : " ;
        this.sage = "21";
        this.phone = "Phone : " ;
        this.sphone = "083-5153409";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSemail() {
        return semail;
    }

    public void setSemail(String semail) {
        this.semail = semail;
    }

    public String getBdate() {
        return bdate;
    }

    public void setBdate(String bdate) {
        this.bdate = bdate;
    }

    public String getSbdate() {
        return sbdate;
    }

    public void setSbdate(String sbdate) {
        this.sbdate = sbdate;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSage() {
        return sage;
    }

    public void setSage(String sage) {
        this.sage = sage;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSphone() {
        return sphone;
    }

    public void setSphone(String sphone) {
        this.sphone = sphone;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

}
