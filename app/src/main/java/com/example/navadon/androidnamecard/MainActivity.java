package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private MainViewModel mainViewModel;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initInstances();
    }

    private void initInstances() {
        /**
         * Binding View Model
         */
        mainViewModel = new MainViewModel();
        mainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainBinding.setViewModel(mainViewModel);

    }
}
