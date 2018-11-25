package com.example.navadroid.androiddatabinding;

import android.arch.lifecycle.ViewModel;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class MainViewModel extends ViewModel {

    private String string;

    public MainViewModel(){
        this.string = "0";
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }



}
