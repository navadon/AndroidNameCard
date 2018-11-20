package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;
    private MainViewModel viewmodel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_swap:
                        break;
                }
            }
        };
    }

    private void initView() {
        viewmodel = new MainViewModel(getApplicationContext());
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewmodel);
        binding.tvName.setText(viewmodel.getName());
        binding.tvSurname.setText(viewmodel.getSurname());
        binding.tvPosition.setText(viewmodel.getPosition());
        binding.tvEmail.setText(viewmodel.getEmail());
        binding.tvPhone.setText(viewmodel.getPhoneNumber());
        initOnClickListener();
        findViewById(R.id.btn_swap).setOnClickListener(onClickListener);
    }
}
