package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {

    private String string;
    private String moreInfo;


    public MainViewModel(){
        this.string = "Click button to show data.";
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    public String getMoreInfo() {
        return moreInfo;
    }

    public void setMoreInfo(String moreInfo) {
        this.moreInfo = moreInfo;
    }
}
