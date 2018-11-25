package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class ActivityMainView extends ViewModel {
    private String name;

    public ActivityMainView(){
        name = "";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
