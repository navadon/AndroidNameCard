package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.databinding.DataBindingUtil;
import com.example.navadon.androidnamecard.databinding.ActivityMainBindingImpl;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;
    private MainViewModel viewModel;
    ActivityMainBindingImpl binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initView(){
        viewModel = new MainViewModel();

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewModel);

        initOnClickListener();
        binding.btnInformation.setOnClickListener(onClickListener);
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnInformation:
                        goToInformation();
                        finish(); // Close Intent
                        break;
                }
            }
        };
    }

    private void goToInformation() {
        startActivity(new Intent(this,InformationActivity.class));
    }
}
