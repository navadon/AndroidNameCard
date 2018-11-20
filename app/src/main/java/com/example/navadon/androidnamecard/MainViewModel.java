package com.example.navadon.androidnamecard;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.ViewModel;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class MainViewModel extends ViewModel {

    private String name;
    private String surname;
    private String position;
    private String email;
    private String phone_number;
    private Integer profile;
    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
        this.name = context.getResources().getString(R.string.name_tim);
        this.surname = context.getResources().getString(R.string.surName_tim);
        this.position = context.getResources().getString(R.string.position_tim);
        this.email = context.getResources().getString(R.string.email_tim);
        this.phone_number = context.getResources().getString(R.string.phone_tim);
        this.profile = R.drawable.profile_tim;
    }

    public String getName() { return this.name; }
    public String getSurname() { return this.surname; }
    public String getPosition() { return this.position; }
    public String getEmail() { return this.email; }
    public String getPhoneNumber() { return this.phone_number; }
    public Integer getProfile() { return this.profile; }

    public void setName(String name) { this.name = name; }
    public void setSurname(String surname) { this.surname = surname; }
    public void setPosition(String position) { this.position = position; }
    public void setEmail(String email) { this.email = email; }
    public void setPhone_number(String phone_number) { this.phone_number = phone_number; }
    public void setProfile(Integer profile) { this.profile = profile; }
}
