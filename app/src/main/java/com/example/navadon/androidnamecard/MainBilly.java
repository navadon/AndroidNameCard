package com.example.navadon.androidnamecard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainBilly extends AppCompatActivity {

    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_billy);
        initView();
    }

    private void initView(){
        initOnClickListener();
        findViewById(R.id.btn_next0).setOnClickListener(onClickListener);
    }

    private void initOnClickListener(){
        // Only one OnclickListener is created to handle all onClick events.
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btn_next0:
                        Intent intent2 = new Intent(MainBilly.this, MainMark.class);
                        startActivity(intent2);
                        finish();
                        break;

                }
            }
        };
    }

}
