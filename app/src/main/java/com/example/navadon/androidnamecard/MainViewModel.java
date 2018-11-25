package com.example.navadon.androidnamecard;

import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableInt;

public class MainViewModel extends ViewModel {

    private String string;

    String showText = "Show AOF's data";
    String hideText = "Hide AOF's data";


    public MainViewModel(){
        this.string = "Show AOF's data";
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }
}
