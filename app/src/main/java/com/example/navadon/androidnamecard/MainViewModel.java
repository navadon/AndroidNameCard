package com.example.navadon.androidnamecard;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;

public class MainViewModel extends ViewModel {
    public ObservableField<String> tvName;
    public ObservableField<String> tvEmail;
    public ObservableField<String> tvCode;
    public ObservableField<String> tvPhone;
    public ObservableField<String> tvAddress;
    public Boolean status;

    public MainViewModel(){
        tvName = new ObservableField<>("Apirom Yaboon");
        tvEmail = new ObservableField<>("molysulfur.mos@gmail.com");
        tvCode = new ObservableField<>("580611065");
        tvPhone = new ObservableField<>("099-2696776");
        tvAddress = new ObservableField<>("46/4 Sanmahapon MeaTang Chiang Mai 50150");
        status = true;
    }

    /**
     * Binding OnClick
     * Change State Information
     */
    public void changeInformation() {
        if(status){
            tvName.set("Niphitpon Daungyai");
            tvCode.set("580611033");
            tvEmail.set("niphitpon_daungyai@cmu.ac.th");
            tvPhone.set("087-2241621");
            tvAddress.set("161 Chontida mantion room.201 Suthep Suthep Chiang Mai 50200");
            status = false;
        }else {
            tvName.set("Apirom Yaboon");
            tvEmail.set("molysulfur.mos@gmail.com");
            tvCode.set("580611065");
            tvPhone.set("099-2696776");
            tvAddress.set("46/4 Sanmahapon MeaTang Chiang Mai 50150");
            status = true;
        }
    }
}
