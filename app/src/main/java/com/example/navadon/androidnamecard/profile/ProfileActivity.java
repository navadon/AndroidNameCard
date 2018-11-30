package com.example.navadon.androidnamecard.profile;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.navadon.androidnamecard.R;
import com.example.navadon.androidnamecard.databinding.ActivityProfileBinding;

public class ProfileActivity extends AppCompatActivity {
    private ProfileViewModel profileViewModel;
    ActivityProfileBinding profileBinding;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        profileViewModel = new ProfileViewModel();
        profileBinding = DataBindingUtil.setContentView(this, R.layout.activity_profile);
        profileBinding.setViewModel(profileViewModel);

        setListener();
    }

    private void setListener() {
        // set text watcher
        profileBinding.etUsername.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                profileViewModel.username.set(s.toString());
            }
        });
    }
}
