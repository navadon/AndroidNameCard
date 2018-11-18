package com.example.navadon.androidnamecard;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.navadon.androidnamecard.databinding.ActivityMainBindingImpl;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;
//    private TextView fullName;
    private int num = 0;
    private MainViewModel viewModel;
    ActivityMainBindingImpl binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bindView();
        initView();
    }
    private void bindView(){
        viewModel = new MainViewModel();
//        fullName = (TextView) findViewById(R.id.nameMe);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setViewmodel(viewModel);
        viewModel.setFullName(getString(R.string.nameSmile));
        viewModel.setContact(getString(R.string.telMailSmile));
        binding.nameMe.setText(viewModel.getFullName());
        binding.contactSmile.setText(viewModel.getContact());
    }

    private void initView(){
        initOnClickListener();
        findViewById(R.id.btn_click).setOnClickListener(onClickListener);
        findViewById(R.id.cardView).setOnClickListener(onClickListener);
    }

    // You don't have to bind any functions to "android:onClick" in layout XML file.
    private void initOnClickListener(){
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_click :
                        Intent intent = new Intent( MainActivity.this,Main2Activity.class);
                        startActivity(intent);
                        break;
                    case R.id.cardView:
                        changeName(num);
                        num +=1;
                }
            }
        };
    }

    @SuppressLint("SetTextI18n")
    private  void changeName(int val){
        if (val%2 != 0) {
                    viewModel.setFullName( getString(R.string.nameSmile));
//            fullName.setText( getString(R.string.nameSmile));
        }
        else {
            viewModel.setFullName("SMILE :D");
//            fullName.setText("SMILE :D");
        }
        binding.nameMe.setText(viewModel.getFullName());
    }







}
