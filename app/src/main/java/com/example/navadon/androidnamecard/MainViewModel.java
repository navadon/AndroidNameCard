package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private String name;
    private String number;
    private String button;

    public MainViewModel(){

    }

    public String getName() {

        return this.name;
    }

    public String getNumber() {
        return this.number;
    }

    public String getButton() {
        return this.button;
    }

    public void setName(String string) {
        this.name = string;
    }

    public void setNumber(String string) {
        this.number = string;
    }

    public void setButton(String string) {
        this.button = string;
    }
}
