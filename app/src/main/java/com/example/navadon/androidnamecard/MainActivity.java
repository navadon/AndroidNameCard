package com.example.navadon.androidnamecard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private View.OnClickListener onClickListener;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void initOnClickListener() {
        onClickListener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
//                    case R.id.btn_process_4:
//                        greet();
//                        break;
                }
            }
        };
    }
}
