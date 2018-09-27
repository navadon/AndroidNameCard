package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        bindView();
        initView();
    }
    private void bindView(){

    }


    public void initView(){
        initOnClickListener();
        findViewById(R.id.btn_click_2).setOnClickListener(onClickListener);

    }

    // You don't have to bind any functions to "android:onClick" in layout XML file.
    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_click_2:
                        Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                        startActivity(intent);
                        break;

                }

            }
        };
    }
}
