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
    private ImageView profile_picture;
    private Context context;

    public MainViewModel(Context context) {
        this.context = context;
        this.name = context.getResources().getString(R.string.name_tim);
        this.surname = context.getResources().getString(R.string.surName_tim);
        this.position = context.getResources().getString(R.string.position_tim);
        this.email = context.getResources().getString(R.string.email_tim);
        this.phone_number = context.getResources().getString(R.string.phone_tim);
        int img = R.drawable.profile_tim;
        this.profile_picture.setImageResource(img);
    }

    public void Switch() {
        this.name = context.getResources().getString(R.string.name_pond);
        this.surname = context.getResources().getString(R.string.surName_pond);
        this.position = context.getResources().getString(R.string.position_pond);
        this.email = context.getResources().getString(R.string.email_pond);
        this.phone_number = context.getResources().getString(R.string.phone_pond);
    }

    public String getName() { return this.name; }
    public String getSurname() { return this.surname; }
    public String getPosition() { return this.position; }
    public String getEmail() { return this.email; }
    public String getPhoneNumber() { return this.phone_number; }
    public ImageView getProfilePicture(View view) { return (ImageView) view.findViewById(R.id.img_profile); }
}
