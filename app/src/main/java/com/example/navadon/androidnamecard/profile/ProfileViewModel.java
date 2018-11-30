package com.example.navadon.androidnamecard.profile;

import android.arch.lifecycle.ViewModel;
import android.databinding.ObservableField;
import android.util.Log;

public class ProfileViewModel extends ViewModel {

    public ObservableField<String> username = new ObservableField<>("test");

    public void save(){
        Log.e("Profile ViewModel", username.get());
    }

}
