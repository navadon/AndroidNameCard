package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.navadon.androidnamecard.databinding.Activity2Binding;

public class Activity2 extends AppCompatActivity {

    private ViewModels tmp;
    private Activity2Binding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_2);
        tmp = new ViewModels();
        tmp.setTest("Burintawat Sittinun");
        tmp.setTest2("Interested in UI/UX Design");
        tmp.setTest1("aaaa");
        binding.setData(tmp);
    }
}
