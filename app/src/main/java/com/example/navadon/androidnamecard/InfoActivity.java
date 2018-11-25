package com.example.navadon.androidnamecard;

import android.content.pm.ActivityInfo;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.example.navadon.androidnamecard.databinding.ActivityInfoBinding;

public class InfoActivity extends AppCompatActivity {

    ActivityInfoBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_info);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_info);
    }

}
