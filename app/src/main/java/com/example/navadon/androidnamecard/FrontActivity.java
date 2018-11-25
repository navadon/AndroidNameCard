package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.navadon.androidnamecard.databinding.ActivityFrontBinding;

public class FrontActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        initView();
    }

    private void initView() {
        initOnClickListener();

        FrontActivityViewModel frontActivityViewModel = new FrontActivityViewModel();

        ActivityFrontBinding activityFrontBinding = DataBindingUtil.setContentView(this, R.layout.activity_front);
        activityFrontBinding.setModel(frontActivityViewModel);

        frontActivityViewModel.setFrontflip("tap B to flip");

        findViewById(R.id.imageB).setOnClickListener(onClickListener);
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.imageB:
                        startBack();
                }
            }
        };
    }

    private void startBack() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }
}
