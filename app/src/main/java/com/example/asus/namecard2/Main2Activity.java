package com.example.asus.namecard2;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.asus.namecard2.databinding.ActivityMain2Binding;
import com.example.asus.namecard2.model.User;
import com.example.asus.namecard2.model.User2;
import com.example.asus.namecard2.viewmodel.User2Model;


public class Main2Activity extends AppCompatActivity {


    public ActivityMain2Binding activityMain2Binding;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        //setContentView(R.layout.activity_main2);

        activityMain2Binding = DataBindingUtil.setContentView(this, R.layout.activity_main2);

        User2 user2 = new User2();
        user2.setName("Thanakorn Panyakong");
        user2.setYears("4th year Student");
        user2.setMobile("0982808547");
        user2.setEmail("Thanakorn_job@hotmail.com");
        user2.setNickname("JOB");

        User2Model user2Model = new User2Model(user2);

        activityMain2Binding.setJob(user2Model);
        //ActivityMainBinding activityMainBinding = new ActivityMainBinding();
        //User user = new User();
        //UserModel userModel = new UserModel(user);
        //activityMainBinding.setPeech(userModel);



    }

    public void process(View v){
        if(v.getId() == R.id.btn_perawit){
            Intent intent = new Intent(Main2Activity.this,MainActivity.class);
            startActivity(intent);
        }
    }

}
