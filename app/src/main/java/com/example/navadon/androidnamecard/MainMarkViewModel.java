package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainMarkViewModel extends ViewModel {

    private String name;
    private String studentid;
    private String citizenid;
    private String faculty;

    public MainMarkViewModel(){

    }

    public String getName(){
        return this.name;
    }

    public void setName(String string) {
        this.name = string;
    }

    public String getStudentid() {
        return studentid;
    }

    public void setStudentid(String string) {
        this.studentid = string;
    }

    public String getCitizenid() {
        return citizenid;
    }

    public void setCitizenid(String string) {
        this.citizenid = string;
    }

    public String getFaculty() {
        return faculty;
    }

    public void setFaculty(String string) {
        this.faculty = string;
    }
}