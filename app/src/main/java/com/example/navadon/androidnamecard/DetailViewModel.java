package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;
import android.databinding.BindingAdapter;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

public class DetailViewModel extends ViewModel {
    private String et1;
    private String et2;
    private String picturePath;

    //get value
    public String getEt1() {
        return et1;
    }

    public String getEt2() {
        return et2;
    }

    public String getPicturePath() {
        return picturePath;
    }

    //set value

    public void setEt1(String et1) {
        this.et1 = et1;
    }

    public void setEt2(String et2) {
        this.et2 = et2;
    }

    public void setPicturePath(String picturePath) {
        this.picturePath = picturePath;
    }

    @BindingAdapter("android:src")
    public void setImageResource(ImageView imageView, int resource){
        imageView.setImageResource(resource);
    }

}
