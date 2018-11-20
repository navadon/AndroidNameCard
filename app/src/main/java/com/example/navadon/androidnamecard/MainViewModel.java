package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    public String text = "Text binding";

    MainViewModel(){
        text = "Supapitch Thungtragul\nFaculty of Engineering, CMU";
    }

    public void setText(String text) {
        this.text = text;
    }
}
