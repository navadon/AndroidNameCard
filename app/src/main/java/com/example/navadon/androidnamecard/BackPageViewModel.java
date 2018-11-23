package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class BackPageViewModel extends ViewModel {

    private String name;
    private String university;
    private String button;

    public BackPageViewModel(){

    }

    public String getName() {

        return this.name;
    }

    public String getUniversity() {
        return this.university;
    }

    public String getButton() {
        return this.button;
    }

    public void setName(String string) {
        this.name = string;
    }

    public void setUniversity(String string) {
        this.university = string;
    }

    public void setButton(String string) {
        this.button = string;
    }
}
