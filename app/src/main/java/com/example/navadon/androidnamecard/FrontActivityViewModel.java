package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class FrontActivityViewModel extends ViewModel {

    private String frontflip;

    public FrontActivityViewModel() {
        frontflip = "";
    }

    public void setFrontflip(String frontflip) {
        this.frontflip = frontflip;
    }

    public String getFrontflip() {
        return frontflip;
    }
}
