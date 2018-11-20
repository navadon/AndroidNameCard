package com.example.navadon.androidnamecard;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

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

    private void initView() {
        viewmodel = new MainViewModel(getApplicationContext());
        final ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewmodel);
        bind(binding);
        Button btn_swap = (Button) findViewById(R.id.btn_swap);
        btn_swap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                swapData();
                bind(binding);
            }
        });

    }

    private void bind(ActivityMainBinding binding ){
        binding.tvName.setText(viewmodel.getName());
        binding.tvSurname.setText(viewmodel.getSurname());
        binding.tvPosition.setText(viewmodel.getPosition());
        binding.tvEmail.setText(viewmodel.getEmail());
        binding.tvPhone.setText(viewmodel.getPhoneNumber());
        binding.imgProfile.setImageResource(viewmodel.getProfile());
    }

    private void swapData(){
        if(viewmodel.getName().equals(getResources().getString(R.string.name_tim))){
            viewmodel.setName(getResources().getString(R.string.name_pond));
            viewmodel.setSurname(getResources().getString(R.string.surName_pond));
            viewmodel.setPosition(getResources().getString(R.string.position_pond));
            viewmodel.setEmail(getResources().getString(R.string.email_pond));
            viewmodel.setPhone_number(getResources().getString(R.string.phone_pond));
            viewmodel.setProfile(R.drawable.profile_pond);
        } else {
            viewmodel.setName(getResources().getString(R.string.name_tim));
            viewmodel.setSurname(getResources().getString(R.string.surName_tim));
            viewmodel.setPosition(getResources().getString(R.string.position_tim));
            viewmodel.setEmail(getResources().getString(R.string.email_tim));
            viewmodel.setPhone_number(getResources().getString(R.string.phone_tim));
            viewmodel.setProfile(R.drawable.profile_tim);
        }
    }
}
