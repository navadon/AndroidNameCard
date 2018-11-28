package com.example.asus.namecard2;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Context;
import android.content.Intent;
import com.example.asus.namecard2.databinding.ActivityMainBinding;
import com.example.asus.namecard2.model.User;
import com.example.asus.namecard2.model.User2;
import com.example.asus.namecard2.viewmodel.User2Model;
import com.example.asus.namecard2.viewmodel.UserModel;



public class MainActivity extends AppCompatActivity {


    //public
    public ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        user.setName("Name : Perawit Samart");
        user.setYears("4th year Student  ");
        user.setMobile("0878660082");
        user.setEmail("peechdevil@gmail.com");
        user.setNickname(" Peech ");


        UserModel userModel = new UserModel(user);
        activityMainBinding.setPeech(userModel);

       // UserModel userModel = new UserModel();
       // userModel.setMobile(userModel.mobile);
        //userModel.setEmail("p" + userModel.getEmail());
        //activityMainBinding.setPeech(userModel);



    }

    public void process(View v){
        if(v.getId() == R.id.btn_next){
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }

    }

}
