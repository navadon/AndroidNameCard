package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class BackActivityViewModel extends ViewModel {

    private String backflip;

    public BackActivityViewModel() {
        backflip = "";
    }

    public void setBackflip(String backflip) {
        this.backflip = backflip;
    }

    public String getBackflip() {
        return backflip;
    }
}
