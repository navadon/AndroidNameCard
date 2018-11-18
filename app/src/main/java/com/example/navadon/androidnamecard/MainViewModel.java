package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    private String fullName;
    private String contact;

    public MainViewModel(){
        this.fullName = "Full name";
        this.contact = "Tel and email";

    }

    public void setFullName(String string) {
        this.fullName = string;
    }

    public String getFullName() {
        return fullName;
    }

    public void setContact(String string){
        this.contact = string;
    }

    public String getContact(){
        return contact;
    }


}
