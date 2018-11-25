package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.navadon.androidnamecard.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    private void initView() {
        initOnClickListener();

        BackActivityViewModel backActivityViewModel = new BackActivityViewModel();

        ActivityMainBinding activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        activityMainBinding.setModel2(backActivityViewModel);

        backActivityViewModel.setBackflip("tap info to flip");

        findViewById(R.id.layoutInfo).setOnClickListener(onClickListener);
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.layoutInfo:
                        startFront();
                        break;
                }
            }
        };
    }

    private void startFront() {
        startActivity(new Intent(this, FrontActivity.class));
        finish();
    }
}
