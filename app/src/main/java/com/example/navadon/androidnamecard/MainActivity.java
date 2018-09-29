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

    private void initView(){
        initOnClickListener();
        findViewById(R.id.btn_billy).setOnClickListener(onClickListener);
        findViewById(R.id.btn_mark).setOnClickListener(onClickListener);
    }

    private void initOnClickListener(){
        // Only one OnclickListener is created to handle all onClick events.
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {

                    case R.id.btn_billy:
                        Intent intent = new Intent(MainActivity.this, MainBilly.class);
                        startActivity(intent);
                        finish();
                        break;
                    case R.id.btn_mark:
                        Intent intent2 = new Intent(MainActivity.this, MainMark.class);
                        startActivity(intent2);
                        finish();
                        break;

                }

            }
        };
    }




    }

