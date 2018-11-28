package com.example.asus.namecard2.viewmodel;


import android.databinding.BaseObservable;
import android.databinding.Bindable;

import com.example.asus.namecard2.BR;
import com.example.asus.namecard2.R;
import com.example.asus.namecard2.model.User;

public class UserModel extends BaseObservable{

    public String name;
    public String years;
    public String mobile;
    public String email;
    public String nickname;



    public UserModel(User user) {
        this.name = user.name;
        this.years = user.years;
        this.mobile = user.mobile;
        this.email = user.email;
        this.nickname = user.nickname;


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getYears() {
        return years;
    }

    public void setYears(String years) {
        this.years = years;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


}
