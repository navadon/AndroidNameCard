package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;


public class ViewModels extends ViewModel {
    private String FullName;
    private String MobileandAge;


    public String getFullName() {
        return FullName;
    }

    public void setFullName(String fullName) {
        this.FullName = fullName;
    }

    public String getMobileandAge() {
        return MobileandAge;
    }

    public void setMobileandAge(String mobileandAge) {
        this.MobileandAge = mobileandAge;
    }


}
