package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;

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
                        Next();
                        break;
                }
            }
        };
    }

    private void initView() {
        initOnClickListener();
        findViewById(R.id.btn_swap).setOnClickListener(onClickListener);
    }

    private void Next() {
        Intent intent = new Intent(this, AnotherActivity.class);
        startActivity(intent);
    }
}
