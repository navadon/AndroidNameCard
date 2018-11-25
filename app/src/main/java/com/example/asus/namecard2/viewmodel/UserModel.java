package com.example.asus.namecard2.viewmodel;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.asus.namecard2.BR;

public class UserModel extends BaseObservable{

    public String mobile;

    public UserModel() {

    }
    @Bindable

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
        notifyPropertyChanged(BR.mobile);

    }
}
