package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private String string;

    public MainViewModel(){
        this.string = "Click to knows my secret";
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}